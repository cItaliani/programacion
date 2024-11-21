import java.util.Scanner;
    public class basico {
    public static void main(String args[]) {
    
        Scanner sc = new Scanner (System.in);

        System.out.println ("Bienvenidos a mi superprograma v.1.0");
        System.out.println ("Ahora unas preguntas...");
        
        System.out.print ("por favor, dime tu nombre: ");
        String nombre;
        nombre= sc.nextLine();

        System.out.print ("ahora dime tu dirección: ");
        String direccion;
        direccion= sc.nextLine();

        System.out.print ("dime tu edad, por favor: ");
        int edad;
        edad= sc.nextInt();

        System.out.println ("De acuerdo, tu nombre es " +nombre+ 
        " vives en " +direccion+ " y tienes " +edad+ " años.");
 z   }
}