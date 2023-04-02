/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a02112022;

/**
 *
 * @author USUARIO
 */
import javax.swing.JOptionPane;
public class ComparoNombres {
    public static void main(String[] args) {
        String nom1;
        String nom2;
        JOptionPane.showMessageDialog(null,"ingrese dos nombre","NOMBRES",JOptionPane.INFORMATION_MESSAGE);
        nom1 =JOptionPane.showInputDialog(null,"ingrese primer  nombre:");
        nom2 =JOptionPane.showInputDialog(null,"ingrese segundo  nombre:");
        
        nom1 = nom1.toUpperCase();
        nom2 = nom2.toUpperCase();
        if (nom1.equals(nom2)) {
            
            JOptionPane.showMessageDialog(null,"los nombres SON iguales", "COMPARACION",JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            JOptionPane.showMessageDialog(null,"los nombres SON DISTINTOS", "COMPARACION",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
