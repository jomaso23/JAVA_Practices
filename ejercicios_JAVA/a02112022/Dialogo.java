
package a02112022;

import javax.swing.JOptionPane;
public class Dialogo {
    
    public static void main(String[] args){
        //ESTE ES UN EJEMPLO DE CUADRO DE DIALOGO EMERGENTE QUE PUEDE VER EL USUARIO
        //mensae de adentro del cuadro //titulo del cuadro de dialogo//aqui hay todo una serie de opciones
        JOptionPane.showMessageDialog(null,"Bienvenidos","Dialogo",JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,"CHAU","Dialogo",JOptionPane.QUESTION_MESSAGE);
        
        //ESTE ES UN EJEMPLO DE CUADRO DE DIALOGO EMERGENTE QUE PUEDE VER EL USUARIO
        //DONDE SE PUEDEN INGRESAR DATOS
        
        String nombre;
        String edad;
        int ed=0;
        nombre = JOptionPane.showInputDialog(null,"ing. nombre");
        edad = JOptionPane.showInputDialog(null,"ing. edad");
        ed = Integer.parseInt(edad);
        if (ed>18) {
             JOptionPane.showMessageDialog(null,"nombre: " + nombre + " es mayor de edad","Edad",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
        
    }
    
}
