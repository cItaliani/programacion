import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class bol3ejer8 {
    // incluye el 9

    public static boolean primo(int x) { //TODO docs
        if (x <= 1) {
            return false;
        }
        for (int i = x - 1; i >= 2; i--) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter f = new PrintWriter("bol3ejer9-3.txt");
        int opcion = 0;
        int numUsu = 0;
        String archivo = "";
        int solucion = 0;
        do {
            System.out.println("1.- mostrar los numeros primos hasta el numero del usuario");
            System.out.println(
                    "2.- pide el nombre de un archivo y dice si lo snumeros que contiene y dice si son primos o no");
            System.out.println(
                    "3.- se le pide al usuario un numero y se guarda en archivo los numeros primos menores a este");
            System.out.println("4.- salir del programa");
            System.out.print("¿que deseas hacer? :");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("dime un número:");
                    numUsu = sc.nextInt();
                    for (int i = numUsu - 1; i >= 2; i--) {
                        if (primo(i)) {
                            System.out.print(i + ", ");
                        }
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.print("¿Cual es el archivo a consultar?: (ejemplo: nombre.extension)");
                    archivo = sc.nextLine();
                    Scanner scf = new Scanner(new File(archivo));
                    int numero;
                    while (scf.hasNextInt()) {
                        numero = scf.nextInt();
                        if (primo(numero)) {
                            System.out.println(numero + " Es primo");
                        } else {
                            System.out.println(numero + " No es primo");
                        }
                    }f.close();
                    System.out.println();
                    break;
                case 3:
                    do {
                        System.out.println("dime un numero, recuerda que tiene que ser mayor que [2]");
                        numUsu = sc.nextInt();
                    } while (numUsu < 2);
                    for (int i = 2; i < numUsu; i++) {
                        if (primo(i)) {
                            f.print(i + "; ");
                        }
                    }
                    f.close();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("cerrando el programa...");
                    break;
                default:
                    System.out.println("dime una opcion válida");
            }
        } while (opcion != 4);
    }
}
