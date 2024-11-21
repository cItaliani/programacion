import java.util.Scanner;

public class converLibrasEur {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cantidad;
        double conversion;
        int elecUsu;

        do {
            System.out.println("bienvenido al programa de intercambio de divisas");
            System.out.println("¿ de que moneda queieres hacer la conversion?");
            System.out.println("1) Para convertir EUR a GBP");
            System.out.println("2) Para convertir de GPB a EUR");
            System.out.println("0) Para salir del programa");
            System.out.print("¿que deseas hacer?");
            elecUsu = sc.nextInt();

            switch (elecUsu) {
                case 1:
                    System.out.print("¿que cantidad de EUR deseas cambiar a GBP?");
                    cantidad = sc.nextDouble();
                    while (cantidad <= 0) {
                        System.out.println("cantidad no válida.");
                        System.out.print("¿que cantidad de EUR deseas cambiar a GBP?");
                        cantidad = sc.nextDouble();
                    }
                    conversion = cantidad * 0.84;
                    System.out.printf("tu cantidad en libras es de: %.2f GBP \n", conversion);
                    break;
                case 2:
                    System.out.print("¿que cantidad de GBP deseas cambiar a EUR?");
                    cantidad = sc.nextDouble();
                    while (cantidad <= 0) {
                        System.out.println("cantidad no válida.");
                        System.out.print("¿que cantidad de GBP deseas cambiar a EUR?");
                        cantidad = sc.nextDouble();
                    }
                    conversion = cantidad * 1.19;
                    System.out.printf("tu cantidad en euros es de: %.2f EUR \n", conversion);
                    break;
                case 0:
                    System.out.println("gracias por utilizar nuestros servicio.");
                    System.out.println("cerrando programa...");
                    break;
                default:
                    System.out.println("por favor, escoge una respuesta válida.");
                    break;
            }
        } while (elecUsu != 0);

    }
}