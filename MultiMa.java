package Clase08;
import javax.swing.*;

public class MultiMa 
{
    private int matriz[][];

    private int matriz2[][];
     
    private int multi[][];

    private int fila;

    private int columna;

    private int valores;


    public MultiMa()
    {
        
        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Fila para la matriz 1"));

        columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna para la matriz 1"));

        this.matriz = new int[fila][columna];

        
        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Fila para la matriz 2"));

        columna  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna para la matriz 2"));

        this.matriz2 = new int[fila][columna];

         multi= new int[fila][columna];


    }

    public void agregarMatriz1()
    {
        for (int fila=0; fila < this.matriz.length; fila++)
        {
            for (int columna=0; columna < this.matriz[fila].length; columna++)
            {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("valores para la matriz 1"));

                this.matriz[fila][columna] = this.valores;
            }
        }
    }

    public void mostrarMatriz1()
    {
        System.out.println("matriz 1");
        for(int fila=0; fila < this.matriz.length; fila++)
        {
            for(int columna=0; columna < this.matriz[fila].length; columna++)
            {
                System.out.printf("%d ", this.matriz[fila][columna]);
            }
            
            System.out.println();
        }
    }

    public void agregarMatriz2()
    {
        for (int fila=0; fila < this.matriz2.length; fila++)
        {
            for (int columna=0; columna < this.matriz2[fila].length; columna++)
            {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("valores para la matriz 2"));

                this.matriz2[fila][columna] = this.valores;
            }
        }
    }

    public void mostrarMatriz2()
    {
        System.out.println("matriz 2");
        for(int fila=0; fila < this.matriz2.length; fila++)
        {
            for(int columna=0; columna < this.matriz2[fila].length; columna++)
            {
                System.out.printf("%d  ", this.matriz2[fila][columna]);
            }

            System.out.println();
        }
    }

     public void calcularMulti()
    {
        System.out.println("resultado");
        for (int a = 0; a < matriz2[0].length; a++) 
        {

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++)
        {
            multi[fila][columna]+=matriz[fila][a] * matriz2[a][columna];
            System.out.printf("%d ", multi[fila][columna]);
        }
          System.out.println();
        }
        }
    }





    public static void main(String args[])
    {
        MultiMa matriz = new MultiMa();

        matriz.agregarMatriz1();

        matriz.mostrarMatriz1();

        matriz.agregarMatriz2();

        matriz.mostrarMatriz2();
        matriz.calcularMulti();}

    }
