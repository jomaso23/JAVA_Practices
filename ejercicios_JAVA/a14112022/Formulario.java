/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a14112022;

/**
 *
 * @author USUARIO
 */
import javax.swing.JFrame;
public class Formulario extends JFrame {
    public static void main(String[] args) {
        
        EjerFormu form1 = new EjerFormu();
        
        form1.setBounds(0,0,600,400);
        form1.setVisible(true);
        form1.setDefaultCloseOperation(Formu.EXIT_ON_CLOSE);
    }
    
}
