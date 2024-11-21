import java.util.Scanner;

public class Ent3Max {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantNum; // cantidad de numeros que va a meter el usuario
        int num; // numero que mete el usuario en la vuelta presente
        // int inicio =0;
        int posicion = 1; // vuelta de bucle que lleva el usuario
        int mayor=0; // aqui guardamos cual de los numeros es el mayor, este valor varia en cada
                       // vuelta

        System.out.print("¿cuantos numeros desea introducir?");
        cantNum = sc.nextInt();

        while (posicion <= cantNum) {
            System.out.printf("introduce tu posicion Nº%d: ", posicion);
            num = sc.nextInt();
            System.out.println("tu número es: " + num); // aqui vemos que la linea 18 funciona correctamente
            
            if(posicion==1){
                mayor=num;
            }
            if (num >mayor) {  
                mayor = num;  
            }
            
            posicion = posicion + 1;
        }
        System.out.println("el mayor numero introducido es: " + mayor);

    }
}
