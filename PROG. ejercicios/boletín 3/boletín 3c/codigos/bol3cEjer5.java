import java.util.Scanner;

public class bol3cEjer5 {
    /**
     * 
     * @param a 1er numero inroducido (real)
     * @param b 2º numero inroducido (real)
     * @param c 3er numero inroducido (real)
     * @param d 4º numero inroducido (real)
     * @param e 5º numero inroducido (real)
     * @return devuelve la media de los numeros anteriores
     */
    public static double media(double a, double b, double c, double d, double e) {
        double resultado = (a + b + c + d + e) / 5;
        return resultado;
    }
    /**
     * 
     * @return devuelve la mediade los números introducidos 
     */
    public static double numUsuario() {
        double sumatorio = 0;
        double numUsuario = 0;
        int contador = 0;
        double media;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("introduce un número, si no desas meter mas tienes que pulsar 0");
            numUsuario = sc.nextDouble();
            sumatorio = sumatorio + numUsuario;
            contador++;
        } while (numUsuario != 0);
        media= sumatorio/(contador-1);
        return media;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numDouble1;
        double numDouble2;
        double numDouble3;
        double numDouble4;
        double numDouble5;
        double goal;


        System.out.println("dime tu primer numero (decimal):");
        numDouble1= sc.nextDouble();
        System.out.println("dime tu segundo numero (decimal):");
        numDouble2=sc.nextDouble();
        System.out.println("dime tu tercer numero (decimal):");
        numDouble3= sc.nextDouble();
        System.out.println("dime tu cuarto numero (decimal):");
        numDouble4= sc.nextDouble();
        System.out.println("dime tu quito numero (decimal):");
        numDouble5= sc.nextDouble();
        goal= media(numDouble1, numDouble2, numDouble3, numDouble4, numDouble5);
        System.out.printf("la media de tus numeros es %.2f" , goal);


        goal=numUsuario();
        System.out.println("tu resultado es: " + goal); // solo para comprobar que funciona 
    }
}