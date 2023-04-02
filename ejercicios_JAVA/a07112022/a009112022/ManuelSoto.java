
package a009112022;
public class ManuelSoto {
    public static void main(String[] args) {
        String[] ast1 ={"*","**","***","****"};
        String[] ast2 ={"   *   ","  ***  "," ***** ","*******"};
        //primer Asterisco
        for (int i = 0; i< ast1.length; i++) {
            System.out.println(ast1[i]);
        }
        //Segundo Asterisco
        for (int i = 0; i< ast2.length; i++) {
            System.out.println(ast2[i]);
        }
        //Tercer Asterisco
        for (int i = 0; i< ast2.length; i++) {
            System.out.println(ast2[i]);
            if (i==3) {
                for (int j = ast2.length-2; j>=0 ; j--){
                    System.out.println(ast2[j]);
                }
            }else{
            continue;}
        }
                
    }
    
}
