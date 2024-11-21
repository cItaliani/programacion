import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class bol3ejer5Curro {

    public static boolean yearBisiesto(int year) {

        return (year % 4 == 0 || year % 400 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int year;

        // Escritura del archivo
        PrintWriter f = new PrintWriter("bol3ejer5Curro.txt");

        do {
            System.out.print("ingresa el año a consultar(0 para SALIR): ");
            year = sc.nextInt();
            // System.out.println(year + " " + yearBisiesto(year));
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
        } while (year != 0);
        f.close();

        // Lectura del archivo
        Scanner scf = new Scanner(new File("bol3ejer5Curro.txt"));
        String linea;
        scf.nextLine();
        boolean flag = true;
        while (scf.hasNextLine()) {
            linea = scf.nextLine();
            if (flag){

                System.out.print(linea);
                flag=false;
            } else {
                System.out.print(","+linea);

            }
            // System.out.print(year + ","); NO USAR
        }
        System.out.println(".");
        scf.close();
    }
}