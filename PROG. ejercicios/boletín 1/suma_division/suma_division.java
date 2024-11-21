import java.util.Scanner;
    public class suma_division{
    public static void main(String args[]) {
    
        Scanner sc = new Scanner (System.in);
        int numA;
        int numB;
        
      
        System.out.println ("hola, bienvenido a mi programa matemático");
        System.out.print ("por favor, ingresa tu primer número: ");
        numA= sc.nextInt();

        System.out.print ("de acuerdo, intresa tu segundo número: ");
        numB= sc.nextInt();

        int resultado_suma = numA+numB;
        int resultado_division = numA/numB;
        int modulo = numA%numB;

        System.out.println ("de acuerdo, tus numeros son:"+numA+ " y "+numB);
        System.out.println ("la suma de " +numA+ " + " +numB+ " es igual a: " +resultado_suma );
        System.out.println ("la división de " +numA+ " / " +numB+ " es igual a: " +resultado_division );
        System.out.println ("su resto es: " +modulo);
        }
    }