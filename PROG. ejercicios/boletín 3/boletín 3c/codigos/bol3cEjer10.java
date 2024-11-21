import java.util.Scanner;
import java.lang.Math;

public class bol3cEjer10 {

    public static int sumaDoble(int inicio) {
        int suma = 0;
        if (inicio < 0) {
            inicio = inicio * -1;
        }
        if (inicio >= 1 && inicio <= 50) {
            for (int i = 1; i <= 100; i++) {
                if (i % inicio == 0) {
                    System.out.print(i + ", ");
                    suma = suma + i;
                }
            }
        } else if (inicio > 50) {
            suma =  (int) (Math.random() * (inicio - 50) + 50);
        } else if (inicio == 0) {
            suma = 0;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio;
        int resultado;
        System.out.println("dime un numero: ");
        inicio = sc.nextInt();
        resultado = sumaDoble(inicio);
        System.out.println();
        System.out.println("el valor que devuelve la funcion es " + resultado); // solo para comprobar que funciona
    }
}
