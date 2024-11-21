import java.io.File;
import java.util.Scanner;

public class bol3ejer1 {
    // ejercicio 1.a
    /**
     * introduce lineas vacias hasta x
     * @param x numero de líneas vacías
    */
    public static void Nlineas(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println();
        }
    }

    // ejercicio 1.b
    /**
     * comprueba si número es par 
     * @param x número a comprobar
     * @return true ~ par // false ~ impar
     */
    public static boolean par(int x) {
        return x % 2 == 0;
    }
    // lo de abajo es lo mismo de arriba
    /*
     * if (x % 2 == 0) {
     * return true;
     * } else {
     * return false;
     * }
     */

    // ejercicio 1.c
    /**
     * comprueba si número es positivo
     * @param x número a comprobar
     * @return true ~ positivo // false ~ negativo
     */
    public static char impr(int x) {
        return (x >= 0 ? 'P' : 'N');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String linea;
        int numero;
        // ejercicio 1.d
        System.out.print("Dime tu nombre: ");
        nombre = sc.nextLine();
        Nlineas(10);
        System.out.print("introduce un número:");
        numero = sc.nextInt();
        if (par(numero)) {
            System.out.println("el número introducido es par");
        } else {
            System.out.println("el número introducido es impar");
        }
        if (impr(numero)=='P') {
            System.out.println("el número introducido es positivo");
        } else {
            System.out.println("el numero introducido es negativo");
        }
    }
}