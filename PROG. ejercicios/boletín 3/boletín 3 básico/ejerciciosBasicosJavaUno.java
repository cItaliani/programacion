import java.util.Scanner;

public class ejerciciosBasicosJavaUno {
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
    System.out.println("HOLA");}
    }
    //ejercicio 3.1
    public static void pintaMensaje(String msg){
        System.out.println(msg);
    }
    //ejercicio 4
    public static void pintaMensaje10(String msg){
        for (int i = 0; i < 10; i++) {
            System.out.println(msg);}
    }
    //ejercicio 5
    public static void pintaVariosMensajes(String msg, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(msg);}
    }
    //ejercicio 6 

    public static void main(String[] args) {

        saludo();
        System.out.println();

        saludo10();
        System.out.println();

        variosSaludos(5);
        System.out.println("------");
        variosSaludos(2);
        System.out.println();

        pintaMensaje("adios");
        System.out.println();
        
        
        pintaMensaje10("adios");
        System.out.println();
        

        pintaVariosMensajes("adios", 3);
    }
}