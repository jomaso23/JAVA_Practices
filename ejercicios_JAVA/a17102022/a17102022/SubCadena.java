/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a17102022;

import java.util.Scanner;

/**
 3.- Se ingresa una cadena. La computadora muestra
 * las subcadenas formadas por las posiciones pares e impares
 * (contando desde cero) de la cadena ingresada.
 */
public class SubCadena {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        String cadena = "";
        System.out.println("ingrese cadena:");
        cadena = teclado.next();
        String acuPar = "";
        String acuImpar = "";
        for (int i = 0; i < cadena.length(); i++) {
            
            if ((i+2)%2==0) {
                acuPar += cadena.charAt(i);
            }else{
                acuImpar += cadena.charAt(i);
            }
        }
        System.out.println("la cadena de las posicione pares es: " + acuPar);
        System.out.println("la cadena de las posicione Impares es: " + acuImpar);
    }
    
}
