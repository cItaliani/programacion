import java.util.Scanner;

public class valorN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acu = 0;
        int cont = 0;

        do {
            cont = cont + 1;
            acu = acu + cont;
        } while (acu < 10000);
        System.out.println("el número es: " + cont);

    }
}