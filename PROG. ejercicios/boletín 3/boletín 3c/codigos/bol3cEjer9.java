import java.util.Scanner;

public class bol3cEjer9 {

    public static int comprueba(int a, boolean flag) {
        int suma = 0;

        if (flag) {
            for (int i = 0; i < a; i++) {
                if (i % 2 == 0) {
                    suma = a + suma;
                }
            }
        }else{
            for (int i = 0; i < a; i++) {
                if (i % 2 != 0) {
                    suma = a + suma;
                }
            }
        }
        return suma;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inicio;
        int opcion;
        int resultado;
        boolean flag;

        System.out.println("introduce [0] para sumar impares");
        System.out.println("introduce [1] para sumar pares");
        opcion= sc.nextInt();
        System.out.println("dime un numero: ");
        inicio = sc.nextInt();
        if (opcion == 1) {
            flag=true;
        } else {
            flag = false;
        }
        resultado = comprueba(inicio, flag);
        System.out.println(resultado);

    }
}
