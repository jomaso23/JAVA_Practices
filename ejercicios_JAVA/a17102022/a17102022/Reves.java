/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a17102022;

/**
1.- Desarrollar un algoritmo que permita mostrar un arreglo de caracteres de atrás para adelante.
Ejemplo: Arreglo {'A','V','A','J'}, la computadora muestra: 'J' 'A' 'V' 'A'.
 */
import java. util.Scanner;
public class Reves {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] reves = {"A","V","A","J"};
        String[] derecho = new String[reves.length];
        int j=0;
        String acumDer = " ";
        String acumRev = " ";
        
        for (int i = reves.length-1; i >= 0;i--) {
            
            derecho[j]=reves[i];/*aqui se reañiza ña asgnacion a nuevo array*/
            acumRev += reves[j];
            acumDer+=derecho[j];
            j++;
        }
        System.out.println("reves: " + acumRev + ", derecho: " + acumDer);
        
        
        
    }
    
}
