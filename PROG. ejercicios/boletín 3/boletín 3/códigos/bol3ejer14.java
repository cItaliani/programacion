import java.util.Scanner;

public class bol3ejer14 {
    /**
     * 
     * @return puntaje de ramdon entre 1 y 6
     */
    public static int tirada() {
        int cara = 0;
        int limiteInf = 1;
        int limiteSup = 6;
        cara = (int) (Math.random() * (limiteSup - limiteInf + 1)) + limiteInf;
        return cara;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dado1 = 0;
        int dado2 = 0;
        int totalUsu = 0;
        int totalIA = 0;
        // presentacion del programa.
        System.out.println("Bienenido al juego de CRAPS");
        System.out.println();
        System.out.println("Te preseno las reglas del juego \natento...");
        System.out.println("si en la primera tirada tus dados suman 7 u 11 ganarás el juego.");
        System.out.println("si la suma es 2,3 o 12 se denomina CRAPS, pierdes el juego.");
        System.out.println(
                "si la suma es un numero entre el 4 y el 6 o entre el 8 y el 10 se suman y se te asigna la puntuación.");
        System.out.println("Luego es mi turno, con las mismas normas, empecemos....");
        System.out.println("\n");
        // accion de usuario
        System.out.println("Tira tus dados: ");
        dado1 = tirada();
        System.out.println("con tu primer dado has obtenido un: " + dado1);
        dado2 = tirada();
        System.out.println("con tu segundo dado has obtenido un: " + dado2);
        totalUsu = (dado1 + dado2);

        System.out.print("la suma de tus dados es: " + totalUsu);
        if (totalUsu == 7 || totalUsu == 11) {
            System.out.println("!!!FELICIDAES¡¡¡ Usuario, Has ganado el juego");
        } else {
            if ((totalUsu == 2 || totalUsu == 3 || totalUsu == 12)) {
                System.out.println(" Lo lamento, usuario, pierdes el juego");
            } else {
                System.out.println("Usuario, tu puntuación es: " + totalUsu);
                System.out.println();
                System.out.println("ahora es el turno de IA: "); // accion de IA
                dado1 = tirada();
                System.out.println("con el primer lanzamiento IA ha obtenido un: " + dado1);
                dado2 = tirada();
                System.out.println("con el segundo lanzamiento IA ha obtenido un: " + dado2);
                totalIA = (dado1 + dado2);
                System.out.print("la suma de los dados de IA  " + dado1 + " y " + dado2 + " es: " + (totalIA));
                if (totalIA == 7 || totalIA == 11) {
                    System.out.println("!!!IA gana el juego¡¡¡ (^_^)");
                } else {
                    if (totalIA == 2 || totalIA == 3 || totalIA == 12) {
                        System.out.println(" IA pierde. !!!FELICIDAES¡¡¡ Usuario ");
                    } else {
                        System.out.println(" IA ha acumulado : " + totalIA + "puntos");
                        if (totalUsu > totalIA) {
                            System.out.println("has ganado por " + (totalUsu - totalIA) + " punto(s). ENHORABUENA");
                        } else {
                            if (totalIA > totalUsu) {
                                System.out
                                        .println("IA gana por " + (totalIA - totalUsu)
                                                + " punto(s). (^_^)");
                            } else {
                                System.out.println("es un empate; Usuario, IA, bien jugado.");
                            }
                        }
                    }
                }
            }
        }
    }
}