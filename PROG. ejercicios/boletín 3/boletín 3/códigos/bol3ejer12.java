import java.util.Scanner;

public class bol3ejer12 {
/**realiza quiniela aleatoria 
 * @return devuevle un resustado aleatorio (1 x 2)
 */
    public static char quiniela_1() {
        int resultado = 1; // 
        int limiteInf = 1;
        int limiteSup = 4;
        char uno = '1';
        char dos = '2';
        char tres = 'X';
        resultado = (int) (Math.random() * (limiteSup - limiteInf)) + limiteInf;
        
        if (resultado == 1) {
            return uno;
        } else if (resultado == 2) {
            return dos;
        } else {
            return tres;
        }
    }
/** realiza quiniela con probabilidades ajustadas 
 * @return devuevle el resustado aleatorio con diferente probabilidad (1 60% - x 25% - 2 15%)
 */
    public static char quiniela_2() {
        int resultado = 1;
        int limiteInf = 1;
        int limiteSup = 100;
        char uno = '1'; 
        char dos = '2';
        char tres = 'X';
        resultado = (int) (Math.random() * (limiteSup - limiteInf+1)) + limiteInf;
        //(int) (Math.random() * (100)) + 1;
        System.out.println("  (" + resultado + ")");
        if (resultado <= 60) {
            return uno;
        } else if (resultado > 60 && resultado <= 85) {
            return dos;
        } else {
            return tres;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usuario = 0;
        int repetir = 0;
        do {
            System.out.println("Generacion automatica de quinielas");
            do {
                System.out.println("pulse [1] para jugar una quiniela normal");
                System.out.println("pulse [2] para jugar una quiniela ponderada");
                System.out.println("pulse [0] si has terminado");
                System.out.println();
                System.out.print("escoge que modalidad  de quiniela deseas jugar:");
                usuario = sc.nextInt();
                switch (usuario) {
                    case 1:
                        for (int i = 1; i <= 14; i++) {
                            System.out.printf("partido %02d  resultado  "+quiniela_1() + "\n", i);
                        }
                        System.out.println();
                        break;

                    case 2:
                        for (int i = 1; i <= 14; i++) {
                            System.out.printf("partido %02d  resultado %c ", i , quiniela_2());
                        }
                        System.out.println();
                        break;

                    case 0:
                        System.out.println("Gracias por jugar. Cerrando sistema...");
                        System.out.println();
                        break;

                    default:
                        System.out.println("escoge una opción válida");
                        System.out.println();
                        break;
                }
            } while (usuario != 0);
            System.out.println();
            System.out.println("¿Seguro que queires salir?");
            System.out.println("pulse [1] para volver a jugar");
            System.out.println("pulse [0] para salir");
            repetir = sc.nextInt();
        } while (repetir == 1);
        System.out.println("Gracias por jugar. Cerrando sistema...");
    }
}
