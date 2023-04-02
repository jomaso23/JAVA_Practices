
package a17102022;

/**
1.- Ingresar por teclado los nombres, apellido, género y las 3 notas de los 5 alumnos de una comisión.
Se pide imprimir el nombre y promedio de cada alumno.//LISTO!!!!!
* 
* 
Listado de los alumnos que aprobaron la materia (se aprueba con promedio >=4)
* 
* 
Listado de alumnos promocionados (se promociona con promedio >=8 y no haber reprobado ningún examen)
* 
* 
Listado de alumnos que recursan la materia (promedio menor a 4)
* 
Promedio general
* 
* 
Nombres de los alumnos con promedio menor al promedio general
* 
* 
Porcentaje de alumnos de género femenino que aprobaron la materia
* 
* 
Cantidad de alumnos que deben recursar discriminado por género.
* 
* 

 */
import java.util.Scanner;
public class AlumnosArray {
    public static void main(String[] args) {
        
        String[] nom = new String[5];
        String[] ape = new String[5];
        String[] gen = new String[5];
        double[] not1 = new double[5];
        double[] not2 = new double[5];
        double[] not3 = new double[5];
        double[] prom = new double[5];
        double acuprom = 0;
        double promgral = 0;
        double contFem = 0;
        double promFem = 0;
        double contFemAprob =0;
        
        Scanner teclado = new Scanner(System.in);
        /*IGRESO DE DATOS*/
        for(int i=0; i < nom.length;i++){
            
            System.out.println("ingrese nombre: ");
            nom[i]= teclado.next();
            System.out.println("ingrese apellido: ");
            ape[i]= teclado.next();
            System.out.println("ingrese genero m o f: ");
            gen[i]= teclado.next();
            System.out.println("ingrese nota1: ");
            not1[i]= teclado.nextDouble();
            System.out.println("ingrese nota2: ");
            not2[i]= teclado.nextDouble();
            System.out.println("ingrese nota3: ");
            not3[i]= teclado.nextDouble();
            
            prom[i] = (not1[i]+not2[i]+not3[i])/3;
            
            
            /*PROMEDIO GENERAL acumulador*/
            acuprom = acuprom + prom[i]; 
            
        }
        /*PROMEDIO GENERAL*/
        promgral = acuprom/5;
        
        
        /*IMPRIMIR DATOS DE CADA ALUMNO*/
        System.out.println("DATOS DE LOS ALUMNOS:\n");
        System.out.println("nom   ape  gen   prom:");
        for(int i =0;i<nom.length;i++){
            
            System.out.println(nom[i]+"   "+ape[i]+"  "+gen[i]+"  "+prom[i]);
        
        }
        System.out.println("  \n");
        
        /*IMPRIMIR APROBADOS*/
        System.out.println("ALUMNOS APROBADOS:\n");
        System.out.println("nom   ape   prom:");
        for(int i =0;i<nom.length;i++){
            if(prom[i]>=4 &&prom[i]<8){
                System.out.println(nom[i]+"   "+ape[i]+"   "+prom[i]);
            }else continue;    
        
        }
        
        System.out.println("  \n");
        
        
        /*IMPRIMIR PROMOCIONADOS*/
        System.out.println("ALUMNOS PROMOCIONADOS:\n");
            System.out.println("nombre   apellido   prom:");
            for(int i =0;i<nom.length;i++){
            if(prom[i]>=8){
                System.out.println(nom[i]+"   "+ape[i]+"   "+prom[i]);
            }else continue;
        
        }
        System.out.println("  \n");
        
        
        
        /*IMPRIMIR REPROBADOS*/
        System.out.println("ALUMNOS REPORBADOS:\n");
        System.out.println("nombre   apellido   prom:");
        for(int i =0;i<nom.length;i++){
            
            if(prom[i]<4){
                System.out.println(nom[i]+"   "+ape[i]+"   "+prom[i]);
            }else continue;
        
        }
        
        /*IMPRIMIR ALUM<PROMGRAL*/
        System.out.println("ALUMNOS MAYORE AL PROM. GRAL:\n");
        System.out.println("nombre   apellido   promgral:");
        for(int i =0;i<nom.length;i++){
            
            if(prom[i]<promgral){
                System.out.println(nom[i]+"   "+ape[i]+"   "+prom[i]);
            }else continue;
        
        }
        
        
        /*IMPRIMIR ALUM>PROMGRAL*/
        System.out.println("ALUMNOS MENOR AL PROM. GRAL:\n");
        for(int i =0;i<nom.length;i++){
            
            if(prom[i]>promgral){
                System.out.println(nom[i]+"   "+ape[i]+"   "+prom[i]);
            }else continue;
        
        }
        
        /*IMPRIMIR PORCENTAJE ALUM FEM. APROBADO*/
        for(int i =0;i<nom.length;i++){
            
            if(gen[i].equals("F")){
                contFem++;
                if (prom[i]>=4) {
                    contFemAprob++;
                }
            }else continue;
        
        }
         promFem = (contFemAprob*100)/contFem;
         
         System.out.println("el porcentaje de mujere aprobadas es:"+ promFem);
        
    }
    
}
