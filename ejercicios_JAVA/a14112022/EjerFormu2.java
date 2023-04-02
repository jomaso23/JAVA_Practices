/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a14112022;

/*
2.- Confeccionar una ventana que muestre el nombre de un programa en la parte 
superior y su número de versión en la parte inferior.
No permitir modificar el tamaño de la ventana en tiempo de ejecución.
formu1.setResizable(false)
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
public class EjerFormu2 extends JFrame {
    JLabel nom, ver;
    public EjerFormu2(){
        setLayout(null);
        nom = new JLabel("jellyCat");
        nom.setBounds(240,180,100,40);
        add(nom);
        ver = new JLabel("17.09.234.098");
        ver.setBounds(220,200,100,40);
        add(ver);
    }
    
}
