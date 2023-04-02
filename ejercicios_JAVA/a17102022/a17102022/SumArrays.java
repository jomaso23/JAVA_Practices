
package a17102022;

import java.util.Scanner;

/*
2.- Desarrollar un algoritmo que permita ingresar 5 números pertenecientes al arreglo A y otros 5 números
pertenecientes al arreglo B. La computadora crea y muestra un arreglo C, donde cada posición es el resultado
de la suma del número en la misma posición en el arreglo A con el número en la misma posición en el arreglo B.
Ejemplo: Se ingresa 1 2 3 4 5 y 4 7 1 3 6 la computadora muestra: 5 9 4 7 11.

 */
public class SumArrays {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int[] array_A = new int[5];
        int[] array_B = new int[5];
        int[] array_C = new int[5];
        System.out.println("ingrese 5 valores para ARRAY_A y 5 para ARRAY_B, \n se ingresaran e forma intercalada respectivmente:");
        for (int i = 0; i <array_A.length; i++) {
            array_A[i] = teclado.nextInt();
            array_B[i] = teclado.nextInt();
            array_C[i]=array_A[i]+array_B[i];            
        }
        /*array_A*/
        System.out.println("este es el array_A");
        for (int i = 0; i < array_A.length; i++) {
             System.out.print(array_A[i] + ",");
        }
        
        System.out.println();
        
        /*array_B*/
        System.out.println("este es el array_B");
        for (int i = 0; i < array_A.length; i++) {
             System.out.print(array_B[i]+",");
        }
         System.out.println();
        /*array_C*/
        System.out.println("este es el array_C");
        for (int i = 0; i < array_A.length; i++) {
             System.out.print(array_C[i]+",");
        }
         System.out.println();
        
    }
    
}
