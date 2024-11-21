import java.util.Scanner;

public class bol3cEjer8 {

    public static void numDec() {
        for (int i = 50; i > 0; i--) {
            System.out.printf(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void mult5() {
        for (int i = 70; i >= 25; i--) {
            if (i % 5 != 0) {
                System.out.printf(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void numPar() {
        for (int i = 1; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.printf(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void numImpar() {
        for (int i = 90; i < 130; i++) {
            if (i % 2 != 0) {
                System.out.printf(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcionUsu;

        do {

            System.out.println("plusa[0] Salir.");
            System.out.println("plusa[1] para mostrar numieros del 50 al 1 de manera descendente.");
            System.out.println("plusa[2] para mostrar multiplos de 5 entre el 75 y el 25 de manera descendente.");
            System.out.println("plusa[3] para mostrar numieros pares del 2 al 20 de manera ascendente.");
            System.out.println("plusa[4] para mostrar numieros impares del 90 al 130 de manera ascendente.");
            System.out.print("escoge una opción:");
            opcionUsu = sc.nextInt();

            switch (opcionUsu) {
                case 1:
                    numDec();
                    break;
                case 2:
                    mult5();
                    break;
                case 3:
                    numPar();
                    break;
                case 4:
                    numImpar();
                    break;

                default:
                    System.out.println("numero no válido, escoge otra opción.");
                    break;
            }
        } while (opcionUsu != 0);
        System.out.println("saliendo del sistema...");
    }
}