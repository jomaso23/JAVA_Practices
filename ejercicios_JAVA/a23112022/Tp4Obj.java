
package a23112022;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Tp4Obj extends JFrame implements ActionListener {
 JLabel eti1,eti2,eti3,eti4, desc, monto;
 JTextField txt1, txt2, txt3;
 JButton boton1;
 
 public Tp4Obj(){
    setLayout(null);
    
     eti1 = new JLabel("Compra:");
        eti1.setBounds(100,100,180,50);
        add(eti1);
        txt1= new JTextField();
        txt1.setBounds(180,100,80,40);
        add(txt1);
        
        eti2 = new JLabel("Rebaja:");
        eti2.setBounds(100,180,180,50);
        add(eti2);
        txt2= new JTextField();
        txt2.setBounds(180,180,80,40);
        add(txt2);
        
        boton1 = new JButton("Calcular");
        boton1.setBounds(100,250,120,40);
        add(boton1);
        boton1.addActionListener(this);
        
        eti3 = new JLabel("Descuento:");
        eti3.setBounds(100,300,180,50);
        add(eti3);
        desc= new JLabel("");/*esta parte falta desarrollarla en el constructor*/
        desc.setBounds(180,300,80,40);
        add(desc);
        
        eti4 = new JLabel("Total  Pagar:");
        eti4.setBounds(100,350,180,50);
        add(eti4);
        monto= new JLabel("");/*esta parte falta desarrollarla en el constructor*/
        monto.setBounds(180,350,80,40);
        add(monto);

}

    
    public void actionPerformed(ActionEvent ae) {
        String num1, num2;
        double compra, rebaja, descTotal=0, total=0;
        
        if (ae.getSource()==boton1) {
            num1= txt1.getText();
            num2= txt2.getText();
            compra = Integer.parseInt(num1);
            rebaja = Integer.parseInt(num2);
            descTotal = compra*(rebaja/100);
            total = compra-descTotal;
        }
        desc.setText(""+descTotal);
        monto.setText(""+total);
    }
}
