/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a14112022;

/*
1.- Crear tres objetos de la clase JLabel, ubicarlos uno debajo de otro y mostrar nombres de colores
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
public class EjerFormu extends JFrame {
    
    JLabel obj1;
    JLabel obj2;
    JLabel obj3;
    
    public EjerFormu(){
        setLayout(null);
        obj1 = new JLabel("AMARILLO");
        obj1.setBounds(240,180,100,40);
        add(obj1);
        obj2 = new JLabel("AZUL");
        obj2.setBounds(250,200,100,40);
        add(obj2);
        obj3 = new JLabel("ROJO");
        obj3.setBounds(250,220,100,40);
        add(obj3);
        
    }
    
}
