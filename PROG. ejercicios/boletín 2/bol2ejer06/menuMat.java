import java.util.Scanner;

public class menuMat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usuElig;
        double numeroReal;
        double resultado;
        int resultadoInt;
        int intA;
        int intB;

        do {
            System.out.println("Bienvenido a nuestro programa matemático:");
            System.out.println("1) cuadrado de un número real.");
            System.out.println("2) inverso de un número.");
            System.out.println("3) raiz cuadrada de un número.");
            System.out.println("4) AND a nivel bit; Resultado en Hex.");
            System.out.println("5) OR a nivel bit; Resultado en Hex.");
            System.out.println("0) SALIR del programa.");
            System.out.print("¿Que operación quieres realizar? :");
            usuElig = sc.nextInt();
            switch (usuElig) {
                case 1:
                    System.out.print("¿De que número real quieres hallar su cuadrado?");
                    numeroReal = sc.nextDouble();
                    resultado = numeroReal * numeroReal;
                    System.out.printf("tu resultado es: %.2f \n", resultado);
                    // System.out.println("tú resultado es " +resultado);
                    break;

                case 2:
                    do {
                        System.out.print("¿De que número real quieres realizar el inverso?");
                        numeroReal = sc.nextDouble();
                    } while (numeroReal == 0);
                    resultado = 1 / numeroReal;
                    System.out.printf("tu resultado es: %.4f \n", resultado);
                    // System.out.println("tu resultado es " +resultado);
                    break;

                case 3:

                    do {
                        System.out.print("¿De que número quieres realizar la raiz cuadrada?");
                        numeroReal = sc.nextDouble();
                    } while (numeroReal < 0);
                    
                    resultado = Math.sqrt(numeroReal);
                    System.out.printf("tu resultado es: %.3f \n", resultado);
                    // System.out.println("tu resultado es " + resultado);
                    break;

                case 4:
                    System.out.print("¿De que números quieres realizar AND?");
                    System.out.print("¿Cúal es tu primer número?");
                    intA = sc.nextInt();
                    System.out.print("Cúal es tu segundo número?");
                    intB = sc.nextInt();
                    resultadoInt = intA & intB;
                    System.out.printf("Tu resultado expresado en hexadecimal es: %x \n", resultadoInt);
                    break;

                case 5:
                    System.out.print("¿De que números queires realizar OR?");
                    System.out.print("¿Cúal es tu primer número?");
                    intA = sc.nextInt();
                    System.out.print("Cúal es tu segundo número?");
                    intB = sc.nextInt();
                    resultadoInt = intA | intB;
                    System.out.printf("Tu resultado expresado en hexadecimal es: %X \n", resultadoInt);
                    break;

                case 0:
                    System.out.println("Cerrando programa... Gracias por utilizarlo.");
                    break;

                default:
                    System.out.println("Disculpa, el valor no es válido");
                    break;
            }
        } while (usuElig != 0);

    }
}