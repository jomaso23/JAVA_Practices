/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a14112022;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Circulo {
    
    public double perimetro;
    public String perim;
    public double radio;
    public String rad;
    public double pi = 3.141624;
    public double Area;
    
    public Circulo(){
        
    }
    
    public void setData(double radio){
        this.perimetro = perimetro;
        this.radio = radio;
        rad = JOptionPane.showInputDialog(null,"ingr. Radio",JOptionPane.INFORMATION_MESSAGE);
        radio = Integer.parseInt(rad);
    }
    public double Area(){
        this.Area = Math.pow(2,(pi*radio));
        return Area;
    }
}
