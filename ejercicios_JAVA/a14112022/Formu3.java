/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a14112022;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class Formu3 extends JFrame implements ActionListener {
    JLabel eti1, eti2;
    JTextField text1;
    JButton boton1;
    
    public Formu3(){
        setLayout(null);
        eti1 = new JLabel("Bienvenidos");
        eti1.setBounds(150,100,180,50);
        add(eti1);
        eti2 = new JLabel("Nombre:");
        eti2.setBounds(150,150,100,40);
        add(eti2);
        text1 = new JTextField();
        text1.setBounds(300,150,100,50);
        add(text1);
        boton1 = new JButton("Aceptar");
        boton1.setBounds(300,250,100,50);
        add(boton1);
        boton1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==boton1){
        setTitle(text1.getText());
        }
          
    }
}
