import java.util.Scanner;

public class camb_var {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double uno;
        double dos;
        double x;

        System.out.print("escribe tu primer número: ");
        uno = sc.nextDouble();
        System.out.print("escribe tu segundo número: ");
        dos = sc.nextDouble();
        x=uno; //guardamos viariable uno en variable x.
        uno= dos; // guardamos la variable dos en la variable uno. 
        dos=x; // volvemos a poner el valor x (antiguo 1) en la variable dos.

        /*System.out.printf("tu primer número ahora es %.2f\n", dos);
        System.out.printf("tu segundo número ahora es %.2f\n", uno);*/
       // aqui no tenemos intercambio, solo mostramos en otro orden

        System.out.println("intercambio de números en proceso...");
        System.out.println("tu primer número es: " +uno);
        System.out.println("tu segundo número es: " +dos);
        System.out.println();
    }
}
