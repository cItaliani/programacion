import java.util.Scanner;

public class bol3cEjer3 {

    public static int sumaInt(int inicio) {
        int suma = 0;
        for (int i = 1; i <= inicio; i++) { //con numeros negativos devuelve cero por que "i" > inicio
            suma = suma + i;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numInicial;
        int resultado;
        System.out.print("introduce tu numero: ");
        numInicial = sc.nextInt();
        resultado = sumaInt(numInicial);
        System.out.println(resultado); // solo para comprobar que funciona 
    }
}
