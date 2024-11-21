import java.util.Scanner;
import java.lang.Math;

public class examen1 {
    // ejercicio1
    public static void bucles() {
        System.out.println("ejercicio1.1");
        System.out.println();
        int resultado = 0;
        for (int i = 40; i >= 5; i--) { // bucle muestra impares desde 40 a 5
            if (i % 2 != 0) { // bucle muestra impares desde 40 a 5
                System.out.printf("%2d\n", i); // bucle muestra impares desde 40 a 5
            }
        }
        System.out.println();
        System.out.println("ejercicio 1.2");
        for (int i = 1; i <= 10; i++) { // bucle devuelve pares desde 2 a 10
            if (i % 2 == 0) { // bucle devuelve pares desde 2 a 10
                resultado = resultado + i;// bucle devuelve pares desde 2 a 10
            }
        }
        System.out.println();
        System.out.println(resultado);
    }

    // ejercicio 2
    public static int calculos(int a, int b) {
        int resultado = 1;

        if (b > 0) {
            for (int i = b; i >= 1; i--) {
                resultado = resultado * a;
            }
        } else if (b < 0) {
            b = b * -1; // exponente en positivo
            resultado = a % b;
        } else {
            if (a < 10) {
                // aprender formila de math random
                int limiteSup = 20;
                int limiteInf = 10;
                resultado = (int) (Math.random() * (limiteSup - limiteInf+1)) + limiteInf; // si el sup estra incluido hay qeu sumar +1
            } else {
                int limiteSup = a;
                int limiteInf = 10;
                resultado = (int) (Math.random() * (limiteSup - limiteInf)) + limiteInf;
            }

        }
        return resultado;
    }

    // ejercicio 3 medias o sumas
    public static int mediasOSumas(int Cantnumeros, boolean flag) {
        Scanner sc = new Scanner(System.in);
        int numUsu;
        int contador = 0;
        int resultado;
        if (flag == false) {
            for (int i = 1; i <= Cantnumeros; i++) {
                System.out.println("dime tu numero " + i);
                numUsu = sc.nextInt();
                contador = contador + numUsu;
            }
        }
        return resultado = contador / Cantnumeros;
    }

    // ejercicio 4 piramide
    public static void piramide() {
        for (int i = 10; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eleccion;
        do {
            System.out.println("[1] Bucles: llama a la funcion.");
            System.out.println(
                    "[2] Calculos: Pide dos números enteros y se los pasa a la función Cálculos. Muestra el resultado. ");
            System.out.println(
                    "[3] Media: Llama a la función mediaOSuma calculando la media. Muestra el resultado con 3 decimales.");
            System.out.println("[4] Pirámide: Llama a la función pirámide.");
            System.out.println("[5] Salir: El programa no finaliza mientras no se seleccione esta opción del menú.");
            System.out.print("¿Que opcion queires realizar?...");
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    bucles();
                    break;

                case 2:
                    int numA;
                    int numB;
                    int resultado;
                    System.out.print("dime el primer numero : ");
                    numA = sc.nextInt();
                    System.out.print("dime el segndo numero : ");
                    numB = sc.nextInt();
                    resultado = calculos(numA, numB);
                    System.out.printf("%.3f", resultado);
                    break;

                case 3:
                    int opcion;
                    System.out.println("¿cuantos nuemros queires meter?");
                    opcion = sc.nextInt();
                    resultado = mediasOSumas(opcion, false);
                    break;

                case 4:
                    piramide();
                    break;

                case 5:
                    System.out.println("Finalizando del programa...");
                    break;
                default:
                    System.out.println("escoge una opcion válida.");
                    break;
            }
        } while (eleccion != 5);
    }
}