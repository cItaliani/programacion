import java.util.Scanner;

public class bol3ejer3 {
    // pedir dato

    /**
     * pide un dato y comprueba que sea mayor o igual que cero.
     *
     * @param msg mensaje que se le ofrece al usuario.
     * @return deveulve el Int mayor o igual a cero metido por el usuario.
     */
    public static int pedirDato(String msg) {
        Scanner sc = new Scanner(System.in);
        int dato;
        do {
            System.out.print(msg);
            dato = sc.nextInt();
        } while (dato <= 0);
        return dato;
    }

    // superficie cilindro
    /**
     * calcula superficie de un cilindro
     *
     * @param r radio del cilindro.
     * @param a altura del cilindro.
     * @return resultado de la fórmula.
     *          
     */
    public static double superficieCilindro(int r, int a) {
        return 2 * 3.141592 * r * a;
    }

    // mostrar dato
    /**
     * muestra el resultado con formato
     *
     * @param msg mensaje para el usuario (utilizar %f).
     * @param x   número R a imprimir .
     *             
     */
    public static void mostrarDato(String msg, double x) {
        System.out.printf("%s %.2f",msg, x);
    }

    public static void main(String[] args) {
        int altura;
        int radio;
        double superficie;
        // pedir dato
        altura = pedirDato("ingresa la altura del cilindro: ");
        radio = pedirDato("ingresa el radio del cilindro: ");
        System.out.printf("la altura de tu cilindro es de %d, y su radio de %d \n", altura, radio);
        // superficie cilindro
        superficie = superficieCilindro(radio, altura);
        // mostrar dato
        mostrarDato("la superficie es de: ", superficie);
        mostrarDato(null, superficie);
        /*
         * solución en una sola linea
         * mostrarDato("la superficie es de %.3f",
         * superficieCilindro(pedirDato("ingresa el radio del cilindro: "),
         * pedirDato("ingresa la altura del cilindro: ")));
         */
    }
}