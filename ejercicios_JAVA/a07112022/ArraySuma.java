
package a07112022;

import javax.swing.JOptionPane;

/*
3.- Se ingresan 5 números pertenecientes al arreglo A y otros 5 números pertenecientes al arreglo B.
La computadora muestra un arreglo C, donde cada posición es el resultado de la suma del número en la misma posición
en el arreglo A con el número en la misma posición en el arreglo B.
Ejemplo: Se ingresa 1 2 3 4 5 y 4 7 1 3 6 la computadora muestra 5 9 4 7 11.
(Usar la clase JOptionPane tanto para cargar datos como para mostrar mensajes y resultados)

 */
public class ArraySuma {
    public static void main(String[] args) {
        //declaracion de variables
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        //ingreso al FOR
        for (int i = 0; i < 5; i++) {
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "ingr. num en array A"));
            b[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "ingr. num en array B"));
            c[i] = a[i]+b[i];
        }
        //impresion del array de suma
        for (int i = 0; i < 5; i++) {
            
            JOptionPane.showMessageDialog(null,"en el espacio: " + i + "Resultado: " + c[i] ,"SUMATORIO",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
}
