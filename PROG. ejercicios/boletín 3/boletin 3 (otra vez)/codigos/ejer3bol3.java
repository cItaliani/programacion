import java.util.Scanner;

public class ejer3bol3 {
    public static int pedirDato(int num) {
        Scanner sc = new Scanner(System.in);
        if (num < 0) {
            System.out.println("numero invalido, introduce otro.");
        }
        return num;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = 0;
        int altura =0;
        System.out.println("Dime un numero para asignar a la base");
        base= sc.nextInt();
        pedirDato(base);
        System.out.println("Dime un numero para asignar a la altura");
        altura= sc.nextInt();
        pedirDato(altura);
    }
}