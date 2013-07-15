 */
 import java.util.*; 
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
         public static void main(String[] args) {
{ 
              int dato;
             Scanner leer=new Scanner(System.in);
             
        System.out.println("ingresar un numero");
        dato=leer.nextInt();
        for (int i=1;i<=dato;i++){
        for(int j=1;j<i+1;j++){
        System.out.print("*");
        }
        System.out.println("\n");
        }
    }
}
}
