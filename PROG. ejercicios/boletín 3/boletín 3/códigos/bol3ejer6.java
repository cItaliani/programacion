import java.util.Scanner;

public class bol3ejer6 {
    // ejercicio 6.a
    /**
     * realiza un pontencia
     * 
     * @param base      número que vamos a potenciar
     * @param exponente cantidad de veces que multiplicamos la base
     * @return devuelve el resultado de base^exponente
     */
    public static double potencia(double base, int exponente) {
        double resultado = 1; // TODO Reto: El bucle al ser el mismo, se puede hacer mas breve // realizado con ayuda.
        if (exponente < 0) {
            exponente = exponente * -1;
        }
        for (int i = 0; i < exponente; i++) { // realiza un bucle para hacer la potencia
            resultado = base * resultado;
        }
        if (exponente < 0) {
            resultado = 1 / resultado;
        }
        /*if (exponente >= 0) {
            for (int i = 0; i < exponente; i++) { // realiza un bucle para hacer la potencia
                resultado = base * resultado;
            }
        } else {
            exponente = exponente * -1; // exponente se pasa a positivo al multiplicar por -1
            for (int i = 0; i < exponente; i++) { // se realiza la potencia normal
                resultado = base * resultado;
            }
            resultado = 1 / resultado; // se divide 1 entre el resutlado par terminar la potencia negativa
        }*/
        return resultado;
    }

    public static void potenciaTonta(double base, int exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado = base * resultado;
        }
        // System.out.println(resultado);
    }

    /**
     * 
     * realiza un bucle desde base^0 hasta base^x
     * 
     * @param base      base de la potencia
     * @param exponente exponente max de la potencia
     * 
     */
    public static void potenciasMultiples(double base, int exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado = potencia(base, i);
            System.out.print(resultado + ", ");
        }

    }

    /**
     * 
     * realiza la suma del resultado de las potencias
     ** 
     * @param base      base de la potencia
     * @param exponente exponente maximo de la potencia
     * @return devuelve resultado de suma de pontencias
     */
    public static double progresionGeometrica(double base, int exponente) {
        double resultado = 1;
        double suma = 0;
        for (int i = 0; i <= exponente; i++) {
            resultado = potencia(base, i);
            suma = resultado + suma;
        }
        return suma;
    }

    public static void main(String[] args) {

        double base; // numero que vamos a potenciar
        int exponente; // cantidad de veces que vamos a multiplicar el númeor base
        double solucion; // resultado de base^exponente
        Scanner sc = new Scanner(System.in);
        System.out.println("ejercicio 6.a: ");
        System.out.print("¿que numero quieres elevar?: ");
        base = sc.nextDouble();
        System.out.printf("¿A cuanto queires elevar %.2f?: ", base);
        exponente = sc.nextInt();
        // llamada a la funcion
        solucion = potencia(base, exponente);
        System.out.println(solucion);
        System.out.println();

        System.out.println("ejercicio 6.b: ");
        // tenemos que vovler a pedir al usuario base y exponente
        System.out.print("¿que numero quieres elevar?: ");
        base = sc.nextDouble();
        System.out.printf("¿A cuanto queires elevar %.2f?: ", base);
        exponente = sc.nextInt();
        // llamada a la funcion
        potenciasMultiples(base, exponente);
        System.out.println();

        System.out.println("ejercicio 6.c");
        // tenemos que vovler a pedir al usuario base y exponente
        System.out.print("¿que numero quieres elevar?: ");
        base = sc.nextDouble();
        System.out.printf("¿A cuanto queires elevar %.2f?: ", base);
        exponente = sc.nextInt();
        // llamada a la funcion
        solucion = progresionGeometrica(base, exponente);
        System.out.println(solucion);
    }
}
