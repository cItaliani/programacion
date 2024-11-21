import java.util.Scanner;

public class ejerciciosBasicosJava {
    // ejercicio 1
    public static void saludo() {
        System.out.println("HOLA");
    }

    // ejercicio 2
    public static void saludo10() {
        for (int i = 0; i < 10; i++) {
            System.out.println("HOLA");
        }
    }

    // ejercicio 3
    public static void variosSaludos(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("HOLA");
        }
    }

    // ejercicio 3
    public static void pintaMensaje(String msg) {
        System.out.println(msg);
    }

    // ejercicio 4
    public static void pintaMensaje10(String msg) {
        for (int i = 0; i < 10; i++) {
            System.out.println(msg);
        }
    }

    // ejercicio 5
    public static void pintaVariosMensajes(String msg, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(msg);
        }
    }

    // ejercicio 6
    public static int suma20() {
        int suma = 0;
        for (int i = 0; i < 20; i++) {
            suma = suma + i;
        }
        return suma;

    }

    // ejercicio 7
    public static int sumaN(int n) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma = suma + i;
        }
        return suma;
    }

    // ejercicio 8

    public static int pideNumero(String msg) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        System.out.print("dame un numero int: ");
        x = sc.nextInt();
        return x;
    }

    public static void main(String[] args) {
        // ejercicio 1
        saludo();
        System.out.println();

        // ejercicio 2
        saludo10();
        System.out.println();

        // ejercicio 3
        variosSaludos(5);
        System.out.println();
        variosSaludos(2);
        System.out.println();

        // ejercicio 3
        pintaMensaje("adios");
        System.out.println();

        // ejercicio 4
        pintaMensaje10("adios");
        System.out.println();

        // ejercicio 5
        pintaVariosMensajes("adios", 3);
        System.out.println();

        // ejercicio 6
        System.out.println("la suma de 1 a 20 es " + suma20());
        // ejercicio 6 (otra forma)
        int respuesta_suma20 = suma20();
        System.out.println("la suma de 1 a 20 es " + respuesta_suma20);

        // ejercicio 7
        int num = 15;
        System.out.println("la suma de 1 a " + num + " es " + sumaN(num));
        // ejercicio 7 (otra forma)
        int respuesta_sumaN = sumaN(num);
        System.out.println("la suma de los numeros 1 a " + num + " es " + respuesta_sumaN);

        // ejercicio 8 public static int pideNumero(String msg)
        int respuesta = pideNumero("dime un número y te daré el doble");
        System.out.println("el doble del número que has introducido es " + respuesta * 2);
        //ejercicio 8 (otra forma)
        System.out.println("el doble del número que has introducido es " + pideNumero("dime un número y te daré el doble")*2);
    }
}
