import java.util.Scanner;

public class NEnteroReal {

    public static void main(String[] args) {
       
        int NEntero;
        float NReal;
        Scanner sc = new Scanner(System.in);

        System.out.print("escribe un número entero. Ejemplo N:");
        NEntero = sc.nextInt();

        System.out.print("ahora estribe otro numero real. Ejemplo R,rr:");
        NReal = sc.nextFloat();

        System.out.printf("el número %d en decimal es: %d\n", NEntero, NEntero);
        System.out.printf("el número %d en octal es: %05o\n", NEntero, NEntero); //5 espacios rellenando con 0 ¡¡OK!!
        System.out.printf("el número %d en hexaecimal es: %X\n",NEntero,NEntero); //mayuscula

        System.out.printf("el número %f en decimal con 5 decimales es: %7.3f\n", NReal, NReal);
        
        
        /*System.out.printf("%f\n", NReal);
        System.out.printf("%5.f\n", NReal); //5 espacios rellenando con 0
        System.out.printf("%7.3f\n", NReal);// mostrar real 3 decimales y ocupando 7     */

    }
}