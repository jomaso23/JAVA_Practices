/*
 */
package a23112022;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tp2Obj extends JFrame implements ActionListener {
    JLabel eti1,eti2,eti3,eti4,resulSuma,resulMulti;
    JTextField text1, text2;
    JButton boton1;
    String num1;
    String num2;
    int numero1;
    int numero2;
    
    public Tp2Obj(){
        setLayout(null);
        
        eti1 = new JLabel("Numero1:");
        eti1.setBounds(100,100,180,50);
        add(eti1);
        text1 = new JTextField();
        text1.setBounds(180,100,100,50);
        add(text1);
        eti2 = new JLabel("Numero2:");
        eti2.setBounds(100,150,180,50);
        add(eti2);
        text2 = new JTextField();
        text2.setBounds(180,150,100,50);
        add(text2);
        boton1 = new JButton("calcular");
        boton1.setBounds(100,250,100,50);
        add(boton1);
        boton1.addActionListener(this);
        eti3 = new JLabel("Resultado suma:");
        eti3.setBounds(100,300,180,50);
        add(eti3);
        eti4 = new JLabel("Resultado Mult.:");
        eti4.setBounds(100,320,180,50);
        add(eti4);
        resulSuma= new JLabel(" ");
        resulSuma.setBounds(150,300,180,50);
        add(resulSuma);
        resulMulti= new JLabel(" ");
        resulMulti.setBounds(150,320,180,50);
        add(resulMulti);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==boton1) {
            num1 = text1.getText();
            num2 = text2.getText();
            numero1 = Integer.parseInt(num1);
            numero2 = Integer.parseInt(num2);
        }
        
    }

    
    
}
