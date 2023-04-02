
package a17102022;

/*
3.- Crear un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas). 
Después, va pidiendo posiciones del array por teclado y si la posición es correcta, 
se agrega a una cadena que se mostrará al final, se dejará de insertar cuando se introduzca un -1.

Por ejemplo, si escribo los siguientes números
0 //Añadirá la ‘A’
5 //Añadirá la ‘F’
25 //Añadirá la ‘Z’
50 //Error, inserte otro numero
-1 //fin

Cadena resultante: AFZ

 */
import java.util.Scanner;
public class Abecedario {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int posicion = 0;
        int x = 1;
        String[] abc = {"A","B","C","D","E","F","G","H","I","J","K","M","L","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String cadena = "";
        System.out.println("ingrese la posicion entre 1 y 26 de la letra que desea que se ingrese a la cadena o -1 para salir(*):");
        posicion = teclado.nextInt();
        while (posicion != -1){
            
            if (posicion >=1 && posicion <=26) {
                cadena += abc[posicion-1];
            }else{
                System.out.println("ingrese un nuevo valor entre 1 y 26(1)");
                posicion = teclado.nextInt();
                if (posicion <1 || posicion>26 || posicion == -1) {
                    break;   
                }
            }
            
            System.out.println("ingrese un nuevo valor entre 1 y 26(2)");
            posicion = teclado.nextInt();
            
       }
        System.out.println("RESULTADO: " + cadena);
        System.out.println("su programa ha finalizado: ");
    }
    
}
