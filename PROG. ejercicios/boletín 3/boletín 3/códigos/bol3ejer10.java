import java.util.Scanner;

public class bol3ejer10 {
    /**
     * calculo de area de rectangulo cuadrado o triangulo
     * @param base   base de la figura
     * @param altura altura de la figura
     * @param flag   bandera true rectangulo - bandera false triangulo
     * @return devuelve area de figura segun parametros introducidos
     */
    public static double area(double base, double altura, boolean flag) {
        double area;
        if (flag) {
            area = base * altura;
        } else {
            area = base * altura / 2;
        }
        return area;
    }

    /**
     * calculo de area de circulo
     * @param radio radio de la figura
     * @return area del circulo segun radio introducido
     */
    public static double areacirculo(double radio) {
        double areaC;
        areaC = Math.PI * radio * radio;
        return areaC;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double medida1;
        double medida2;
        double radio = 0;
        double pi = 3.14159;
        int opcion;
        double resultado = 0.0;

        do {
            System.out.println("pulsa [1] si queires calcular el area de un triangulo:");
            System.out.println("pulsa [2] si queires calcular el area de un rectangulo: ");
            System.out.println("pulsa [3] si queires calcular el area de un triangulo: ");
            System.out.println("pulsa [4] si queires calcular el area de un triangulo: ");
            System.out.println("pulsa [0] para salir del programa.");
            System.out.print("¿que deseas hacer?: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("dime la base del triángulo: ");
                    medida1 = sc.nextDouble();
                    System.out.print("dime la altura del triángulo: ");
                    medida2 = sc.nextDouble();
                    resultado = area(medida1, medida2, false);
                    System.out.println("el area de tu figura es " + resultado);
                    break;

                case 2:
                    System.out.print("dime la base del rectangulo: ");
                    medida1 = sc.nextDouble();
                    System.out.print("dime la altura del rectangulo: ");
                    medida2 = sc.nextDouble();
                    resultado = area(medida1, medida2, true);
                    System.out.println("el area de tu figura es " + resultado);
                    break;

                case 3:
                    System.out.print("dime lado del cuadrado: ");
                    medida1 = sc.nextDouble();
                    resultado = area(medida1, medida1, true);
                    System.out.println("el area de tu figura es " + resultado);
                    break;

                case 4:
                    System.out.print("dime radio del circulo: ");
                    radio = sc.nextDouble();
                    resultado = areacirculo(radio);
                    System.out.println("el area de tu figura es " + resultado);
                    break;

                case 0:
                    System.out.print("Cerrando programa...");
                    break;

                default:
                    System.out.println("introduce una opcion válida");
                    break;
            }
        } while (opcion != 0);
    }
}
