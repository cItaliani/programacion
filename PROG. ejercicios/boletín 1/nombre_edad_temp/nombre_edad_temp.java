import java.util.Scanner;
    public class nombre_edad_temp{
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    int edad;
    String nombre;
    double temperatura;

    System.out.print ("¿Cual es tu nombre? ");
    nombre = sc.nextLine();

    System.out.print ("¿Que edad tienes? ");
    edad = sc.nextInt();

    System.out.print ("¿Que temperatura hace hoy? ");
    temperatura = sc.nextDouble();

    System.out.println ("de acuerdo, entonces te llamas " +nombre+ "\n tienes " +edad+ " años \n la temperatura actual es de " +temperatura+ " grados");

      }
    }