import java.util.Scanner;

public class bol3ejer4NoDoc {

    public static boolean añoBisiesto(int año) {
        // if (año % 4 == 0 || año % 400 == 0 && año % 100 != 0) {
        //     System.out.println("el año " + año + " es bisiesto");
        // } else {
        //     System.out.println("el año " + año + " no es bisiesto");
        // }
        return (año % 4 == 0 || año % 400 == 0 && año % 100 != 0) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año;

        // System.out.print("ingresa el año a consultar: ");
        // año = sc.nextInt();

        // lamada a la función

        //System.out.println(añoBisiesto(año));

        //bucle hasta indroducir 0
        do {
            System.out.print("ingresa el año a consultar: ");
            año = sc.nextInt();
            System.out.println(añoBisiesto(año));
        } while (año !=0);

        // if (año % 4 == 0 || año % 400 == 0 && año % 100 != 0) {
        // System.out.println("el año " +año+ " es bisiesto");
        // } else{
        // System.out.println("el año " +año+ " no es bisiesto");
        // }

        // System.out.print("dime un año: ");
        // año = sc.nextInt();

        // System.out.println(bisiesto(año));
        // if (año % 4 == 0 || año % 400 == 0 && año % 100 != 0) {
        // System.out.println("bisiesto");
        // } else {
        // System.out.println("no es bisisesto");
        // }

    }
}
