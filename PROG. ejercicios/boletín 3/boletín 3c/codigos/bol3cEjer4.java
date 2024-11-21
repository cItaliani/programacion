import java.util.Scanner;

public class bol3cEjer4 {
/**
 * 
 * @param a 1er número
 * @param b 2º número
 */
    public static void muestraNum(int a, double b) {
        System.out.printf("el numero en decimal es %d \n" ,a);
        System.out.printf("el numero en octal es %05o \n" ,a);
        System.out.printf("el numero en hexadecimal es %X \n",a);
        System.out.printf("el numero decimal es %7.3f \n" ,b);

    }

    public static void main(String[] args) {
        int numInt;
        double numDouble;
        Scanner sc = new Scanner(System.in);
        System.out.println("dame un numero entero: ");
        numInt= sc.nextInt();
        System.out.println("dame un numero decimal: ");
        numDouble= sc.nextDouble();

        muestraNum(numInt,numDouble); // llama a la funcion y muestra los resultados
    }
}