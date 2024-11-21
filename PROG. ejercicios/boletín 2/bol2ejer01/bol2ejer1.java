public class bol2ejer1 {
public static void main(String[] args) {
    
    
}
    public static void main(String[] args) {
        int maximo = 20;
        int num = 1;

        while (num <= maximo) {
            System.out.println(num);
            num = num + 1;
        }
        // aqui acaba bucle while
        num = 1;

        do {
            System.out.println(num);
            num = num + 1;
        } while (num <= 20);
        // aqui acaba bucle do-while

        // for contiene el inicio, la condición y el aumento: inicio: num=1 condicion:
        // num<= 20 "el maximo" aumento num= num + 1;
        for (num = 1; num <= 20; num = num + 1) {
            System.out.println(num);
        }

        /*
         * ejercicio 1B: A continuación en el mismo programa y con el bucle que
         * prefieras, haz que
         * muestre los números pares entre 1 y 50. Estos deben quedar bien formateados
         * en una columna de tamaño 5 caracteres justificados a la derecha mediante
         * printf.
         */

        num = 1;
        maximo = 50;

        while (num < maximo) {
            if (num % 2 == 0) {
                System.out.printf("%5d\n", num);
            }
            num = num + 1;
        }

        num = 1;
        do {
            if (num % 2 == 0) {
                System.out.printf("%5d\n", num);
            }
            num = num + 1;
        } while (num < maximo);

        for (num = 1; num < maximo; num = num + 1) {
            if (num % 2 == 0) {
                System.out.printf("%5d\n", num);
            }
        }
    }
}