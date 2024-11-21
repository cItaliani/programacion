import java.util.Scanner;

public class bol2ejer17 {

	public static void main(String[] args) {
		System.out.println("apartado A");
		Scanner sc = new Scanner(System.in);
		int usuario = 0;
		int suma = 0;
		int elección;
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0) {
				suma = suma + i;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("la suma de los numeros es:" + suma);
		System.out.println("\n");
		System.out.println("apartado B");
		do {
			suma = 0;
			System.out.print("dime un numero entre 1 y 50:"); // TODO falta repetición bucle dowhile
			usuario = sc.nextInt();
			if (usuario > 1 || usuario < 50) {
				for (int i = usuario; i < 100; i++) {
					if (i % usuario == 0) {
						suma = suma + i;
						System.out.printf(i + ", ");
					}
				}
				System.out.println("");
				System.out.println("la suma de tus múltiplos  es:  " + suma);
			} else {
				System.out.println("escribe un número dentro de rango");
			}
			System.out.println("pulsa [1] si quieres repetir");
			System.out.println("pulsa [0] si queires salir");
			System.out.println("¿cual es tu elección?");
			elección =sc.nextInt();
			if (elección !=1 &&elección !=0 ) {
				System.out.println("selecciona una opcion válida");
			}
		} while (elección != 0);
		System.out.println("saliendo del programa...");

	}
}