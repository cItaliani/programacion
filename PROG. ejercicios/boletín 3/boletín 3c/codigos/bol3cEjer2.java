import java.util.Scanner;

public class bol3cEjer2 {
    public static int comparaNum(double a, double b) {
        if (a > b) {
            return 1;
        } else if (a < b) {
            return 2;
        } else {
            return 0;
        }
    }
    
    public static boolean esMultiplo(int a, int b) {
        if (a%b == 0 || b%a == 0) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero1, numero2;
        int numero3, numero4;
        boolean goal;
        int resultado;

        System.out.print("introduce un número:");
        numero1 = sc.nextDouble();
        System.out.print("introduce otro número:");
        numero2 = sc.nextDouble();
        resultado = comparaNum(numero1, numero2);
        System.out.println("el resultado es " + resultado); // solo para comprobar que funciona 

        System.out.print("introduce un número:");
        numero3 = sc.nextInt();
        System.out.print("introduce otro número:");
        numero4 = sc.nextInt();
        goal= esMultiplo(numero3, numero4);
        System.out.println("el resultado es " + goal); // solo para comprobar que funciona 
    }
}
