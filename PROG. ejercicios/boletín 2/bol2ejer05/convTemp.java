import java.util.Scanner;

public class convTemp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tempUsuario;
        double farenheit;
        double kelvin;
        int usuElig;

        do {
            System.out.print(
                    "a que sistema quieres convertir:\n Grados farenheit(pulse 1) "
                    +"\n Grados kelvin (pulse 2) \n Salir (pulse 3) \n escoger una de las opciones anteriores:");
            usuElig = sc.nextInt();

            switch (usuElig) {
                case 1:
                    System.out.print("temperatura en grados celsius (ºC):");
                    tempUsuario = sc.nextDouble();
                    farenheit = tempUsuario * 1.8 + 32.0;
                    System.out.printf ("la temperatura elegida %.2f grados ºC equivale a %.2f ºF\n", tempUsuario , farenheit);
                    /*System.out.println(
                            "la temperatura " + tempUsuario + " equivale a: " + farenheit + " grados farenheit");  hacer en printf*/
                    break;
                case 2:
                    System.out.print("temperatura en grados celsius (ºC):");
                    tempUsuario = sc.nextDouble();
                    kelvin = tempUsuario + 273.15;
                    System.out.printf ("la temperatura elegida %.2f grados ºC equivale a %.2f K\n", tempUsuario , kelvin);
                    /*System.out.println("la temperatura " + tempUsuario + " equivale a: " + kelvin + " grados kelvin"); hacer en printf*/
                    break;
                case 3:
                    System.out.println("final del programa");
                    break;

                default:
                    System.out.println(
                            "este valor no es válido");
                    break;
            }
        } while (usuElig != 3);

    }

}
