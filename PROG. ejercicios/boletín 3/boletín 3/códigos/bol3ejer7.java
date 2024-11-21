import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class bol3ejer7 {

    public static String saveFile(String nombre) throws Exception {
        String fichero = "";
        Scanner scf =new Scanner(new File(nombre));
        String linea;
        while (hasNextInt()) {
            
        }
        return fichero;

    }

    public static void appendFile(String nombre, String texto) throws Exception {
        PrintWriter f = new PrintWriter("fichero.txt");
        f.close();
    }

    public static void appendFile2(String[] args) throws Exception {
        PrintWriter f = new PrintWriter(new FileWriter("prueba.txt", true));
        f.println("Añadimos texto al final");
        f.close(); //copypaste de los apuntes 
    }

    public static void main(String[] args) {

    }
}
