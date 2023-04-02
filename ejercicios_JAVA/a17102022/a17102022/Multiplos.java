
package a17102022;

import java.util.Scanner;

/*
 4.- Desarrollar un algoritmo que permita pedir al usuario un número entero T y otro M.
 * La computadora crea un arreglo de enteros de T posiciones cargado con los múltiplos de M y lo muestra.
 */
public class Multiplos {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int t = 0;
        
        System.out.println("ingrese el numero T que es el largo del array: ");
        t = teclado.nextInt();
        
        int m = 0;
        int[] multiplo = new int[t];
        
        
        
        System.out.println("ingrese el numero M, que es el inicio de los multiplos: ");
        m = teclado.nextInt();
        
        
        System.out.println(" ");
        for (int i = 0; i < t; i++) {
            multiplo[i]=m*(i+1);
            System.out.print(multiplo[i] + " ");
        }
        System.out.println(" ");
    }
    
}
