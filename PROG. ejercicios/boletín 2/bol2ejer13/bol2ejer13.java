package bol2ejer13;
import java.util.Scanner;

public class bol2ejer13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numUsu;
        int contador;
        int sumaPar = 0;
        int sumaImpar = 0;

        System.out.println("apartado A");
        System.out.print("escoge un numero (vamos a sumar los pares) hasta tu numero:");
        numUsu = sc.nextInt();
        for (int i = 0; i < numUsu; i++) {
            if (i % 2 == 0) {
                sumaPar = sumaPar + i;
            }
        }
        System.out.println(sumaPar);

        System.out.println("apartado B");
        System.out.print("escoge un numero (vamos a sumar los impares) hasta tu numero:");
        numUsu = sc.nextInt();
        for (int i = 0; i < numUsu; i++) {
            if (i % 2 != 0) {
                sumaImpar = sumaImpar + i;
            }
        }
        System.out.println(sumaImpar);

        System.out.println("apartado C");
        sumaPar=0;
        sumaImpar=0;
        System.out.print("escoge un numero (vamos a sumar los pares e impares (aparte) hasta tu numero: ");
        numUsu = sc.nextInt();
        for (int i = 0; i < numUsu; i++) {
            if (i % 2 == 0) {
                sumaPar = sumaPar + i;
            } else {
                sumaImpar = sumaImpar+i;
            }
        }
        System.out.printf("la suma de tus numeros pares es %d, y los impares suman %d" ,sumaPar,sumaImpar);
    }
}