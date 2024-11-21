import java.util.Scanner;

public class bol3ejer4 {
    /**
     * comprueba si un año  es bisiesto
     * 
     * @param year Año a comprobar
     * @return devuelve un boolean true ~ bisiesto // false ~ no bisiesto
     */
    public static boolean yearBisiesto(int year) {
        return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año;
        /**
         * inicio bucle do while
         * pide un año al usuario
         * compreba si es bisiesto o no
         * lo muestra por consola
         */
        do {
            System.out.print("ingresa el año a consultar: ");
            año = sc.nextInt();
            System.out.println(yearBisiesto(año));
        } while (año != 0);
    }
}
