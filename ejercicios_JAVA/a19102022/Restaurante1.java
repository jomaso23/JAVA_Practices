package a19102022;

/*1.- Un restaurante nos ha encargado una aplicación para colocar a los clientes en sus mesas, sólo hay 10 mesas. En una mesa se pueden sentar 
de 0 (mesa vacía) a 4 comensales (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento el programa no está 
preparado para colocar a grupos mayores a 4, por tanto, si un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje 
“Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo”. Para el grupo que llega, se busca siempre
la primera mesa libre (con 0 personas) y se le indica al cliente el número de mesa. 
*/

import java.util.Scanner; 

public class Restaurante1 {
         public static void main(String[] args){
             
                  Scanner teclado = new Scanner(System.in);
                  int personas=0;
                  String[] mesas = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
             
             
                  System.out.println("Ingrese la cantidad de personas: ");
                  personas=teclado.nextInt();
                  
                  for(int i=0; i<mesas.length; i++){
                      
                      
                           if(personas>0 && personas<=4){
                           //
                           }else{
                           System.out.println("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo");
                           }
             
                  }
                  
                  
         }
}
