
package a07112022;

import javax.swing.JOptionPane;

/*
.- Desarrollar un programa que pida una cantidad de artículos comprados y el
precio unitario de ese artículo. Por cada carga debe preguntar si se desea seguir
ingresando de la forma “¿Desea ingresar otro artículo? [S/N]”. 
La carga de datos finaliza cuando se detecta una n o N. La computadora debe mostrar el monto de la factura.
(Usar la clase JOptionPane tanto para cargar datos como para mostrar mensajes y resultados)

 */
public class Compras {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"CHAU","Dialogo",JOptionPane.INFORMATION_MESSAGE);
        String articulo = null;
        String precio;
        int pre=0;
        String res="s";
        while(!res.equals("n")){
        //ingrese articulo
        articulo += JOptionPane.showInputDialog(null," ingr. Articulo " );
        //9ngrese precio
        precio = JOptionPane.showInputDialog(null,"ingr. Precio");
        pre+= Integer.parseInt(precio);
        //pregunte si quiere continuar SI O NO
        res= JOptionPane.showInputDialog(null,"s/n","Desea Continuar?",JOptionPane.QUESTION_MESSAGE);
        //SI :vuelve a repetirse el ciclo
        //NO: finaliza y muestra la el monto de la factura y de ser posible la lista de articulos
        }
        
        JOptionPane.showMessageDialog(null,"el total de la factura es: " + pre ,"FACTURA",JOptionPane.INFORMATION_MESSAGE);

    }
    
}
