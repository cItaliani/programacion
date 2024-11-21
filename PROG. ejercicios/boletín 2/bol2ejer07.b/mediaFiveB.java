import java.util.Scanner;

public class mediaFiveB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador=0; //con esta variable contamos cuantos numeros a metido el usuario.
        double acumulador=0; // aqui se guanda el resultado de las sumas de los numeros del usuario. 
        double num; // numero del usuario.
        double resultado; // awui pondremos la media de los numeros (acumulador/contador)
        
        do {
            System.out.printf("introduce tu número: ");
            num = sc.nextDouble();
            contador=contador+1;
            acumulador= acumulador+num;
        } while (num !=0);
        System.out.println("tus datos son: ");
        System.out.printf("has metido %d posiciones, la suma de tus numeros es %.2f\n",contador , acumulador);
        resultado = acumulador/(contador-1);
        System.out.printf("la media de tus números es: %.4f", resultado);    


    }
}