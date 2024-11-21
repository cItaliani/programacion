import java.util.Scanner;

public class buclesFor {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        System.out.println("A/ cuenta progresiva de 1 a 50");
        for (int cont = 1; cont <= 50; cont++) {
            System.out.println("*" + cont);
        }
        System.out.println("B/ cuenta regresiva: 50 a 1");
        for (int cont = 50; cont >= 1; cont--) {
            System.out.println("*" + cont);
        }
        System.out.println("C/ números pares de 2 a 20");
        for (int cont = 2; cont < 20; cont = cont + 2) {
            System.out.println("*" + cont);
        }
        System.out.println("D/ números impares de 90 a 130");
        System.out.println("opcion 1");                     // revisar (REVISADO)
        for (int cont = 91; cont < 130; cont = cont + 2) { // if (cont%2!=0)
            System.out.println("*" + cont);
        }
        System.out.println("opcion 2"); 
        for (int cont = 90; cont < 130; cont = cont + 1) { 
            if (cont % 2 != 0) {
                System.out.println("*" + cont);
            }
        }
        System.out.println("E/ multiplos de 5 entre 70 y 25"); // revisar (REVISADO)
        System.out.println("opcion 1");
        for (int cont = 70; cont >= 25; cont = cont - 5) {// if (cont%5==0)
            System.out.println("*" + cont);
        }
        System.out.println("opcion 2");
        System.out.println("E/ multiplos de 5 entre 70 y 25");
        for (int cont = 70; cont >= 25; cont = cont - 5) {
            if (cont % 5 == 0) {
                System.out.println("*" + cont);
            }

        }
    }
}