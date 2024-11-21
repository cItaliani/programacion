import java.util.Scanner;

public class NUsuario {

    public static void main(String[] args) {

        int numUsuario;
        int numBase;
        int acu;
        Scanner sc = new Scanner(System.in);
        numBase = 1;
        acu = 0;
        System.out.print("por favor, introduce un número: ");
        numUsuario = sc.nextInt();

        if (numUsuario >=  1) {
            while (numBase < numUsuario) {
                System.out.println("Contador: "+numBase+ "    Acum: "+acu);
                numBase = numBase + 1 ;
                acu = acu+numBase ;
            }
        }System.out.println("el numero es: "+acu);
    }
}
