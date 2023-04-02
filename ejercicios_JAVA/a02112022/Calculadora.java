/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a02112022;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */

public class Calculadora {
    
    /*hacr caluladora con las opciones basicas y mostrar por cuadro de dialogo las opciones y
     terminar de seleccionar en un swicth*/
    public static void main(String[] args) {
        String opc;
        int opcion=0;
        String num1;
        String num2;
        String operacion="";
        double numero1=0;
        double numero2=0;
        double resultado=0;
        JOptionPane.showMessageDialog(null,"INGRESE NUMEROS","NUMEROS",JOptionPane.INFORMATION_MESSAGE);
        //ingreso de primer numero
        num1= JOptionPane.showInputDialog("ingr. NUM1:");
        
        //ingreso de segundo numero
        num2= JOptionPane.showInputDialog("ingr. NUM2:");
        
        //conversion de los numeros
        numero1 = Integer.parseInt(num1);
        numero2 = Integer.parseInt(num2);
        opc = JOptionPane.showInputDialog(null,"seleccione un opcion: \n 1.SUMA \n 2.RESTA \n 3.MULTIPLICACION\n 4.DIVISION \n 5.SALIR ","CALULADORA",JOptionPane.INFORMATION_MESSAGE);
        
        //conversion de la opcion a numero
        opcion = Integer.parseInt(opc);
        
        switch(opcion){
            case 1: operacion = "suma";
                    resultado = numero1+numero2;
                break;
            case 2: operacion = "resta";
                    resultado = numero1-numero2;
                break;
            case 3: operacion = "multipliacion";
                    resultado = numero1*numero2;
                break;
            case 4: operacion = "division";
                    resultado = numero1/numero2;
                break;
            default : operacion = "usted ha salido del progarama";
                      resultado = 0;
                break;
        }
        if (opcion >= 1 && opcion <= 4) {
                JOptionPane.showMessageDialog(null," EL RESULT. DE LA OPERACION : " + operacion + " es " + resultado,"NUMEROS",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"usted ha salido de la calculadora","SALIDA",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }
    
    
}
