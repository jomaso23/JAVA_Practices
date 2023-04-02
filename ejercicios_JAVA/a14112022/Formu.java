/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a14112022;

/*
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Formu extends JFrame {
    
   JLabel eti1,eti2;
  
    
    public Formu(){
        
        setLayout(null);
        eti1 = new JLabel("Bienvenidos!!!");
        eti1.setBounds(250,180,100,40);
        add(eti1);
        eti2 = new JLabel("al curso de JAVA");
        eti2.setBounds(240,200,100,40);
        add(eti2);
        
    }
    
}
