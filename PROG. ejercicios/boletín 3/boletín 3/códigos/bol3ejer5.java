import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class bol3ejer5 {
    /**
     * comprueba si year es bisiesto
     * 
     * @param year dato que introduce el usuario
     * @return devuelve un boolean true ~ bisiesto // false ~ no bisiesto
     */
    public static boolean yearBisiesto(int year) {
        return (year % 4 == 0 || year % 400 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int year;

        // Escritura del archivo
        PrintWriter f = new PrintWriter("bol3ejer5.txt");
        /**
         * inicio bucle do while en dos tramos
         * tramo 1. pide un año al usuario
         * compreba si es bisiesto o no
         * lo guarda en archivo (.txt)
         */
        do {
            System.out.print("ingresa el año a consultar(0 para SALIR): ");
            year = sc.nextInt();
            if (year != 0) {
                if (yearBisiesto(year)) {
                    f.print(year + " Es bisiesto\n");
                } else {
                    f.print(year + " No es bisiesto\n");
                }
                for (int j = year; j <= 2024; j++) {
                    if (yearBisiesto(j)) {
                        f.print(j + "\n");
                    }
                }
            }
            // cierre del fichero
            f.close();

            // Lectura del archivo
            Scanner scf = new Scanner(new File("bol3ejer5.txt"));
            /**
             * bucle do while en dos tramos
             * tramo 2. lee el archivo (.txt)
             * imprime en consola en una sola linea
             */
            String linea;
            scf.nextLine();
            while (scf.hasNextLine()) {
                linea = scf.nextLine();
                System.out.print(linea + (","));
            }
            // cierre de escaner de archivos
            scf.close();
            System.out.println("\n");
        } while (year != 0);
    }
}
