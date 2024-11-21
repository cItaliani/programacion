import java.util.Scanner;

public class m3num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x;
        double y;
        double z;

        System.out.print("dime un primer numero: ");
        x = sc.nextDouble();  //8
        System.out.print("dime un segundo número: ");
        y = sc.nextDouble(); //5
        System.out.print("dime un tercer número: ");
        z = sc.nextDouble(); //3

        if (x > y) {
            if (x > z) {
                System.out.println("el mayor es: " + x);
            } else {
                System.out.println("el mayor es: " + z);
            }
        } else {
            if (y > z) {
                System.out.println("el mayor es: " + y);
            } else {
                System.out.println("el mayor es: " + z);
            }
        }

         //opcion vista con Curro en clase!   
        /*if (x>y && x>z ){
            System.out.println("el mayor es: " + x);
            
        } else {
            if (y>z){
                System.out.println("el mayor es: " + y);
            } else {
                System.out.println("el mayor es: " + z);

            }
        }*/
    }
}