import java.util.Scanner;

/**
 * Seguro
 */
public class Seguro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int edad;
        int anosDeCarnet;
        int precio;

        System.out.print("¿cual es tu edad?");
        edad = sc.nextInt();
        System.out.print("¿cuantos años de carnet tienes?");
        anosDeCarnet = sc.nextInt();

        if (edad < 21) {
            precio = 400; // 300 + 100
        } else { // equivalente a if >= 21
            if (anosDeCarnet >=10) {
                precio = 300;
            } else { // equivalente a if >10 años de carnet
                precio = 270;
            }
            System.out.print ("el precio de tu seguro es de:" + precio + "Euros");
        }

    }
}