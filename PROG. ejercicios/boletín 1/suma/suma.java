import java.util.Scanner;
    public class suma{
    public static void main(String args[]) {
    
        Scanner sc = new Scanner (System.in);
        int numA;
        int numB;
        
      
        System.out.println ("hola, bienvenido a mi programa matemático");
        System.out.print ("por favor, ingresa tu primer número: ");
        numA= sc.nextInt();

        System.out.print ("de acuerdo, intresa tu segundo número: ");
        numB= sc.nextInt();

        int resultado = numA+numB;

        System.out.println ("de acuerdo, tus numeros son:"+numA+ " y "+numB);
        System.out.println ("la suma de " +numA+ " + " +numB+ " es igual a: " +resultado );
        }
    }