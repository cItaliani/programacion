import java.util.Scanner;

public class bol3cEjer1 {
    /**
     * 
     * @param flag
     */

    public static void imprimeNumeros(boolean flag) {
        if (flag == true) {
            for (int i = 1; i <= 20; i++) {
                System.out.print(i+", ");
            }
        } else {
            for (int i = 0; i <= 50; i++) {
                if (i % 2 == 0) {
                    System.out.printf("%5d \n", i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int usuario;
        System.out.println(("escoge una opcion:"));
        System.err.println("pulsa (1) true");
        System.out.println("pulsa (0) false");
        System.out.print("tu opcion es: ");
        usuario = sc.nextInt();
        if (usuario == 1) {
            imprimeNumeros(true);
        } else if (usuario == 0) {
            imprimeNumeros(false);
        }

    }
}