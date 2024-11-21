import java.util.Scanner;

public class bol3cEjer12 {
    public static void linea_asteriscos(int n) {
        for (int i = n; i > 0; i--) {
            System.out.print("*");
        }
    }

    public static void diagonal_asteriscos(int a, boolean b) {
        if (b) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j <= i; j++) {
                    if (i == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }
        } else {
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= a - i; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");

            }
        }
    }

    public static void mediaPiramide(int a) {
        for (int i = 1; i < a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void piramide(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a * 2 - 1; j++) { // incapaz de hacerlo

            }
        }

    }

    public static void main(String[] args) {
        int opcion;
        int estrella;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("pulsa 1 para una linea de (X) asteriscos");
            System.out.println("pulsa 2 para diagonal de (X) asteriscos");
            System.out.println("pulsa 3 para diagonal inversa de (X) asteriscos");
            System.out.println("pulsa 4 para dibujar media piramide");
            System.out.println("pulsa 0 para salir del programa");
            // 5 no realizado
            System.out.println("dime que queires realizar: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¿cuantos (*) quieres imprimir?");
                    estrella = sc.nextInt();
                    linea_asteriscos(estrella);
                    break;
                case 2:
                    System.out.println("¿cuantos (*) quieres imprimir?");
                    estrella = sc.nextInt();
                    diagonal_asteriscos(estrella, true);
                    break;
                case 3:
                    System.out.println("¿cuantos (*) quieres imprimir?");
                    estrella = sc.nextInt();
                    diagonal_asteriscos(estrella, false);
                    break;
                case 4:
                    System.out.println("¿cuantos (*) quieres imprimir?");
                    estrella = sc.nextInt();
                    mediaPiramide(estrella);
                    break;
                case 5:
                    System.out.println("¿cuantos (*) quieres imprimir?");
                    estrella = sc.nextInt();
                    System.out.println("opcion no disponible"); // piramide(estrella); //incapaz de hacerlo
                    break;

                case 0:
                    System.out.println("saliendo del programa...");
                    break;
                default:
                    System.out.println("escoge una opción válida");
                    break;
            }
        } while (opcion != 0);

    }
}
