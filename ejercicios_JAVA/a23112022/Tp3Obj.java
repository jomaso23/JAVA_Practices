/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a23112022;

/*
3.- Un alumno desea saber cual sera su promedio final en la materia de algoritmos. Dicho promedio se compone de tres exámenes.

 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
public class Tp3Obj extends JFrame implements ActionListener {
    JLabel eti1, eti2, eti3, promedio,resultado;
    JTextField txt1, txt2, txt3;
    JButton boton1;
    String num1,num2,num3;
    double numero1, numero2, numero3, prom;
    
    public Tp3Obj(){
        setLayout(null);
        /*aqui va cada etiqueta y boton de la ventana de dialogo o cuadro de texto*/
        eti1 = new JLabel("Exam.1:");
        eti1.setBounds(100,100,180,50);
        add(eti1);
        txt1= new JTextField();
        txt1.setBounds(180,100,80,40);
        add(txt1);
        
        eti2 = new JLabel("Exam.2:");
        eti2.setBounds(100,180,180,50);
        add(eti2);
        txt2= new JTextField();
        txt2.setBounds(180,180,80,40);
        add(txt2);
        eti3 = new JLabel("Exam.3:");
        eti3.setBounds(100,250,180,50);
        add(eti3);
        txt3= new JTextField();
        txt3.setBounds(180,250,80,40);
        add(txt3);
        boton1 = new JButton("PROMEDIAR");
        boton1.setBounds(100,300,120,40);
        add(boton1);
        boton1.addActionListener(this);
        
        promedio = new JLabel("Promedio:");
        promedio.setBounds(100,350,180,50);
        add(promedio);
        resultado = new JLabel("");
        resultado.setBounds(180,350,180,50);
        add(resultado);
        
    }

    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==boton1) {
            
            num1 = txt1.getText();
            num2 = txt2.getText();
            num3 = txt3.getText();
            numero1 = Integer.parseInt(num1);
            numero2 = Integer.parseInt(num2);
            numero3 = Integer.parseInt(num3);
            
            
            
            
        }
        prom = (numero1+numero2+numero3)/3;
        resultado.setText(""+prom);
    }
    
}
