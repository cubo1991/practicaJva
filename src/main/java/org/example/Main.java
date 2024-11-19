package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int [][] matrix = matriz();

        printMatrix(matrix);


    }

    //Creamos una matriz y le agregamos numeros aleatoreos

    public static int [][] matriz(){

    int [] [] matriz = new int[10][10];

for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[0].length; j++) {

        int random = new Random().nextInt(10);
        matriz[i][j] = random;
    }
}

        ArrayList<Integer> numerosPares = new ArrayList<Integer>();
     ArrayList<String> ubicacionPares = new ArrayList<String>();

//Mostramos la matriz
        for(int [] fila : matriz){
            System.out.println();
            for(int columna : fila){
                System.out.print(columna + " ");
            }
        }

    int contadorFila = 0;
      for (int [] row : matriz) {
          System.out.println();
          int contadorColumna = 0;
          for (int elemento : row) {
             if (elemento % 2 == 0) {
                 numerosPares.add(elemento);
                 String ubicacion = "(" + String.valueOf(contadorFila) + "," + String.valueOf(contadorColumna)+ ")";
                 ubicacionPares.add(ubicacion);
             }
             contadorColumna++;
          }
          contadorFila++;
      }
          System.out.println("Los numeros pares son: ");
      for(int numero : numerosPares) {
          System.out.print(numero + " ");

      }
        System.out.println();
      System.out.println("Los numeros pares estan en: ");
      for(String ubicacion : ubicacionPares) {
          System.out.print(ubicacion + " ");
      }
        System.out.println();

return matriz;
        }
    public static void printMatrix(int matrix[][]){

        for (int[] row : matrix) {

            System.out.println(Arrays.toString(row));
        }
    }





    }



