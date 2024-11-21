import java.util.Scanner;

public class bol2ejer2 {

    public static void main(String[] args) {

        int numA;
        int numB;
        Scanner sc = new Scanner(System.in);
        System.out.print("¿cual es tu primer número?");
        numA = sc.nextInt();

        System.out.print("cual es tu segundo número?");
        numB = sc.nextInt();

        if (numA < numB) {
            System.out.println(numB + " es el número mayor");
        } else if (numA > numB) {
            System.out.println(numA + " es el número mayor");
        } else {
            System.out.println("los números son iguales");
        }

        if (numA % numB == 0) {
            System.out.println("los números son múltiplos");
        } else if (numB % numA == 0) {
            System.out.println("los numeros son múltiplos");
        } else {
            System.out.println("los números no son múltiplos");
        }

        //  if (numA % numB == 0 || numB % numA == 0) {
        //     System.out.println("los números son múltiplos");
        // } else   {
        //     System.out.println("los números no son múltiplos");
        // }


    }
}