import java.util.Scanner;
public class adivinaNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0; // numero a adivinar, introducido por el jugador 1
        int num2 = 0; // numero que mete el jugador 2 para intentar acertar el numero de jugador 1
        int jugada; // numero de jugadas 4 + la inicial
        int partida;// para volver a inicializar (o no) la partida
        System.out.println("¡¡Bienvenidos al juego de adivinar el número!!");
        System.out.println("Instrucciones:");
        System.out.println(
                "JUGADOR 1; Deberás introducir un número entre el 1 y el 100, después, el número desaparecerá de la pantalla.");
        System.out.println("JUGADOR 2; Tu misión será adivinar ese numero, tienes un máximo de 5 intentos.");
        do {
            jugada = 4;
            System.out.println("¡¡EMPECEMOS!!...");
            do {
                System.out.print("JUGADOR 1; tu turno. Introduce un numero: ");
                num1 = sc.nextInt();
                if (num1 < 0 || num1 > 100) {
                    System.out.println("Número invalido - (FUERA DE RANGO)");
                    System.out.println("Por favor, introduce un número válido:");
                }
            } while (num1 < 0 || num1 > 100);
            for (int i = 0; i < 100; i++) {
                System.out.println();
            }
            System.out.println("JUGADOR 1; Número memorizado. \nJUGADOR 1; Número borrado");
            System.out.println();
            System.out.println();
            System.out.println("JUGADOR 2; Tu turno. Tienes 5 intentos.");
            System.out.println();
            System.out.println("JUGADOR 2; ¿Que número intrudujo el jugador 1?");
            while (jugada >= 0) {
                do {
                    System.out.print("JUGADOR 2; Introduce un numero: ");
                    num2 = sc.nextInt();
                    System.out.println();
                    if (num2 < 0 || num2 > 100) {
                        System.out.println("JUGADOR 2; Número invalido (FUERA DE RANGO)");
                        System.out.println("por favor, introduce un número válido.");
                    }
                } while (num2 < 0 || num2 > 100);
                if (num2 != num1) {
                    System.out.println("JUGADOR 2; Tu número no es correcto.");
                    System.out.printf("Prueba otra vez. te quedan %d intentos:\n", jugada--);
                    System.out.println();
                    if (num2 < num1) {
                        System.out.println("JUGADOR 2; el numero que buscas es MAYOR que el " + num2);
                    } else {
                        System.out.println("JUGADOR 2; el numero que buscas es MENOR que el " + num2);
                    }
                    if (jugada == -1) {
                        System.out.println();
                        System.out.println();
                        System.out.println("JUGADOR 2; ¡¡¡ELIMINADO!!!");
                        System.out.println("JUGADOR 2; el numero que buscabas era el " + num1);
                        System.out.println();
                        System.out.println();
                        System.out.println("JUGADOR 1; ¡¡¡FELICIDADES, HAS GANADO EL JUEGO!!!");
                    }
                } else {
                    System.out.println("JUGADOR 2; ERES EL GANADOR ¡¡¡FELICIDADES!!!");
                    jugada = -1;
                    System.out.println();
                }
            }
            System.out.println("Ronda finalizada, gracias a los dos.");
            do {
                System.out.println("¿Quereis volver a jugar?: ");
                System.out.println();
                System.out.println("SI - pulsa 1");
                System.out.println("NO - pulsa 2");
                partida = sc.nextInt();
            } while (partida != 1 && partida != 2);
        } while (partida == 1);
        System.out.println("Gracias por jugar.");
        System.out.print("Cerrando programa...");
    }
}



