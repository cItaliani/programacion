import java.util.Scanner;

public class bol3ejer11 {

    public static double factorial(int usuario) {
        /**
         * realiza el factorial de un numero
         */
        double solucion = 1;
        for (int i = usuario; i > 1; i--) {
            solucion = i * solucion;
        }
        return solucion;
    }

    public static double taylor(int x) {
        double solucion = 1;
        solucion = 1 - (bol3ejer6.potencia(x, 2) / factorial(2)) + (bol3ejer6.potencia(x, 4) / factorial(4))
                - (bol3ejer6.potencia(x, 6) / factorial(6));
        return solucion;
    }

    public static void main(String[] args) {
        int usuario; // numero introducido
        double factorial; // dato devuelto por la función
        Scanner sc = new Scanner(System.in);
        System.out.println("dime de que número quieres hallar el factorial: ");
        usuario = sc.nextInt();
        factorial = factorial(usuario);
        System.out.println(factorial);

        System.out.println(taylor(usuario));
    }
}