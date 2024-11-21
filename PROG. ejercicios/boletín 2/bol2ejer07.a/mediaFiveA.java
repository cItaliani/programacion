import java.util.Scanner;

public class mediaFiveA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1;
        double n2;
        double n3;
        double n4;
        double n5;
        double resultado;
        String repetir;
        do {
            System.out.println("Bienvenido, a continuación te pediré una serie de 5 números.");
            System.out.print("Por favor, introduce tu primer número:");
            n1 = sc.nextDouble();
            System.out.print("Ahora, el segundo número:");
            n2 = sc.nextDouble();
            System.out.print("Estupendo, vamos con el tercer número:");
            n3 = sc.nextDouble();
            System.out.print("¿Cúal es tu cuarto número:");
            n4 = sc.nextDouble();
            System.out.print("Por ultimo... Tu quinto número:");
            n5 = sc.nextDouble();

            resultado = (n1 + n2 + n3 + n4 + n5) / 5;
            
            System.out.printf("La media de tus números es: %.2f", resultado);
            System.out.println();

            sc.nextLine();
            do {
                System.out.print("¿Quieres volver calcular? (si/no): ");
                repetir = sc.nextLine();
            } while (!repetir.toLowerCase().equals("si")|| !repetir.toLowerCase().equals("no"));

        } while (repetir.toLowerCase().equals("si"));

            System.out.println("cerrando programa...");

    }
}