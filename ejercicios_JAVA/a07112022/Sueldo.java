/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a07112022;

import javax.swing.JOptionPane;

/*
2.- El usuario ingresa 12 valores, de a uno por vez, pertenecientes a sus sueldos
mensuales durante un año. La computadora muestra su sueldo anual. Si durante la
carga de los sueldos mensuales se detecta un valor negativo, esto indica que aún no se ha cobrado el mes en curso,
por lo tanto, deben dejar de ingresar datos y la computadora debe mostrar la sumatoria de sueldos que se llevan cobrados.
(Usar la clase JOptionPane tanto para cargar datos como para mostrar mensajes y resultados)

 */
public class Sueldo {
    public static void main(String[] args) {
        //declaracion de variables
        String sueldo;
        int x=1;
        int salario=0;
        int suel=0;
        //ingreso al while
        while(x<=12){
            //ingreso el valor del sueldo
            sueldo = JOptionPane.showInputDialog(null,"ingr sueldo: ");
            salario=Integer.parseInt(sueldo);
            //evaluo el valor del sueldo ingresado:
            if (salario<0) {//sueldo<0 salgo del ciclo
                x=12;
                break;
            }else{//sueldo>0 evaluo y continuo ingresando valores
                suel+=salario;
                x++;
                continue;
            }    
        }
        JOptionPane.showMessageDialog(null,"el sueldo es: " + suel,"SUELDO",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
