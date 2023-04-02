
package a17102022;

/*
2.- Crear una aplicación Java que llene un array con x números enteros que se leen por teclado, 
la cantidad de números que se ingresan es un valor dado por teclado. 
A continuación calcula y muestra la media de los valores positivos
y la de los valores negativos del array. Método length.
 */
import java.util.Scanner;
public class AppJava {
    public static void main(String[] args) {
        
        
        Scanner teclado =  new Scanner(System.in);
        System.out.println("ingrese la cantiad de numeros que quiere ingresar:");
        int cant =teclado.nextInt();
        int[] numeros = new int[cant];
        int num = 0;
        double promPos=0;
        double promNeg=0;
        double contPos=0;
        double contNeg=0;
        
        double proTotalPos=0;
        double proTotalNeg=0;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese un numero");
            num = teclado.nextInt();
            numeros[i]=num;            
        }
        
        for (int i = 0; i < numeros.length; i++) {
            
            if (numeros[i]>= 0){
                promPos += numeros[i];
                contPos++;
            }else{
                promNeg += numeros[i];
                contNeg++;    
            }                    
        }
        
        proTotalPos= promPos/contPos;
        proTotalNeg= promNeg/contNeg;
        
        System.out.println("el promedio POSITIVO es: " + proTotalPos);
        System.out.println("el promedio NEGATIVO es: " + proTotalNeg);
        
        
        
    
    }
}
