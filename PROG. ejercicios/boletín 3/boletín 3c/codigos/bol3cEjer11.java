import java.util.Scanner;

public class bol3cEjer11 {

    public static double factorial(int inicio) {
        if (inicio == 0) {
            return 1.0;
        }
        for (int i = inicio - 1; i >= 1; i--) {
            inicio = inicio * i;
        }
        return inicio * 1.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usuario;
        double resultado;
        System.out.println("dime un numero para calcular su factorial: ");
        usuario = sc.nextInt();
        resultado = factorial(usuario);
        System.out.println(resultado);
    }
}
