import java.util.Scanner;

public class Hola2 {
    public static void main(String args[]) {
        /*
         * Declaración de variables: es darle un nombre
         * a que tipo de memoria y guardarlo ahi
         */

        String nombre; /*
                        * String = a cadena de caracteres,
                        * una texto, una frase, peude ser un String vacio
                        */

        int edad; /* variable - donde guardo la edad */
        Scanner sc = new Scanner(System.in);

        // Código
        System.out.print("Dime tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ahora tu edad: ");
        edad = sc.nextInt();
        System.out.println(nombre + ", Welcome to the Java World");
        System.out.println("Nos vemos, ser humano de " + edad + " años");
        // comentario de linea
        /* comentario de bloque */
        /*
         * print: imprime a continuación. println: imprime en linea nueva
         * el tipo char lleva las comillas simples 'A' en lugar de "A" que nos da fallo
         * al compilar
         */
    }
}