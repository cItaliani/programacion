import java.util.Scanner;

public class ejer1bol3 {

    public static void numeroDeN(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }

    public static boolean par(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static char comprueba(int x) {
        if (x >= 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreUsuario;
        int numeroUsuario;

        /*System.err.println("prueba de ejercicio A");
        numeroDeN(4);

        System.err.println("pruba de ejercicio B");
        System.err.println(par(7));
        System.err.println(par(4));

        System.err.println("prueba de ejercicio C");
        System.out.println("realizado con ifelse");
        System.err.println(comprueba(9));
        System.err.println(comprueba(-4));*/

        System.out.println("¿Cual es tu nombre?");
        nombreUsuario = sc.nextLine();
        numeroDeN(10);
        System.out.println("dime un numero (sin decimales)");
        numeroUsuario = sc.nextInt();
        System.out.println(par(numeroUsuario));
        System.out.println(comprueba(numeroUsuario));
    }

}