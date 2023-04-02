
package a23112022;

/*
1.- Se lo evalúa 2 números. y se visualiza como resultado el mayor de los 2 números.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tp1Obj extends JFrame implements ActionListener {
    
    JLabel eti1, eti2, resultado;
    JTextField text1,text2;
    JButton boton1;
    String num1;
    String num2;
    String resul;
    int numero1;
    int numero2;
    public Tp1Obj(){
        setLayout(null);
        
        /*etiqueta y espacio 1*/
        eti1 = new JLabel("Numero 1:");
        eti1.setBounds(150,100,180,50);
        add(eti1);
        text1 = new JTextField();
        text1.setBounds(300,100,100,50);
        add(text1);
        /*etiqueta y espacio 1*/
        eti2 = new JLabel("Numero 2:");
        eti2.setBounds(150,170,100,40);
        add(eti2);
        text2 = new JTextField();
        text2.setBounds(300,170,100,50);
        add(text2);
        /*boton*/
        boton1 = new JButton("Calcular");
        boton1.setBounds(300,250,100,50);
        add(boton1);
        boton1.addActionListener(this);
        /*--------------------------------------------------------*/
        resultado = new JLabel("");
        resultado.setBounds(150,250,180,50);
        add(resultado);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==boton1){
        num1 = text1.getText();
        num2 = text2.getText();
        numero1 = Integer.parseInt(num1);
        numero2 = Integer.parseInt(num2);
        }

        if (numero1 > numero2) {
           
          resultado.setText(" " + numero1);
                
        }else{
            resultado.setText(" " + numero2);
        }
        
    }

}
    

