import java.util.Scanner;
public class bol3cEjer7 {

    public static int calculaNum( int maximo) {
        int suma=0;
        int contador=0;
        do {
            suma = suma+contador;
            contador++;
        } while (suma <= maximo);
        return contador;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int inicial;
        int resultado;
System.out.println("dime tu numero maximo:");
inicial = sc.nextInt();
resultado=calculaNum(inicial);
System.out.println("el numero maximo es " +resultado); // solo para comprobar que funciona 
    }
}