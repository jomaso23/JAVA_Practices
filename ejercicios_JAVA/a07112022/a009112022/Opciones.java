package a009112022;


import javax.swing.JOptionPane;


/*
4.- Hacer un menú muy sencillo. El menú se mostrará por pantalla y tendrá las siguientes opciones:  

Saludar 
Despedirse 
Salir 
Si el usuario introduce un 1, el programa le pedirá el nombre lo saludará: Hola Pepito
Si el usuario introduce un 2, el programa se despedirá: Adios
Si el usuario introduce un 3, el programa terminará. 
(Usar la clase JOptionPane tanto para cargar datos como para mostrar mensajes y resultados)

 */
public class Opciones {
    public static void main(String[] args) {
        String opc;
        String msn="";
        String nombre;
        int opcion=0;
        
        opc =JOptionPane.showInputDialog(null,"1.saludar \n 2.despedirse \n 3.salir");
        opcion= Integer.parseInt(opc);
        
        switch(opcion){
            case 1: nombre = JOptionPane.showInputDialog(null,"ingr Nombre","Nombre"); 
                    msn ="Hola " + nombre;
                break;
            case 2: msn = "adios";
                break;
            default: msn ="el programa termino"; 
                break;
        }
        JOptionPane.showMessageDialog(null, msn, "AVISO",JOptionPane.INFORMATION_MESSAGE);
      
    }
    
}
