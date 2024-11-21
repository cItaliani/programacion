package bol2ejer14;
import java.util.Scanner;
public class bol2ejer14 {

    public static void main(String[] args) {//TODO contar total
        Scanner sc = new Scanner(System.in);
        int numUsu=0;
        int contadorNeg=0;
        int contadorTotal=0;
        System.out.println("vamos a contar numeros, introduce numeros positivos o negativos y yo los ire contando.");
        do {
            System.out.print("introduce un numero, recuerda con [0] saldrás del programa:");
            numUsu = sc.nextInt();
            contadorTotal++;
            if (numUsu <0) {
                contadorNeg++;
            } 
        } while (numUsu!=0);
    System.out.printf("has intruducido %d numeros negativos de un total de %d numeros" , contadorNeg, contadorTotal-1);

    }
}