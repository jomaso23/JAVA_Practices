
package a009112022;

import javax.swing.JOptionPane;

/*
5.- Desarrollar un programa Java que solicite se ingrese un valor en pesos y por medio
de un menú de opciones permita elegir a que moneda convertir dicho ingreso 
(Euro, Dólar, Yen) y muestre el resultado.(Usar la clase JOptionPane tanto para cargar 
datos como para mostrar mensajes y resultados)


 */
public class ConversionMoneda {
    public static void main(String[] args) {
        String pesos;
        String opc;
        String tipo="";
        double moneda =0;
        int opcion=0;
        double conversion=0;
        pesos=JOptionPane.showInputDialog(null,"ING PESOS:","PESOS",JOptionPane.INFORMATION_MESSAGE); 
        moneda = Integer.parseInt(pesos);
        opc = JOptionPane.showInputDialog(null,"1.Dolar \n 2.Euro \n 3.Yen","PESOS",JOptionPane.INFORMATION_MESSAGE); 
        opcion = Integer.parseInt(opc);
        
        switch(opcion){
            case 1: conversion = moneda/190;
                    tipo = "DOLAR";
                break;
            case 2: conversion = moneda/160;
                    tipo = "EURO";
                break;
            case 3: conversion = moneda/1.09;
                    tipo = "YEN";
                break;
        }
        
        JOptionPane.showMessageDialog(null,"el cambio de: "+ tipo + "a pesos es:  " + conversion + "   ","CONVERSION",JOptionPane.INFORMATION_MESSAGE);
        
    
    
    }
    
}
