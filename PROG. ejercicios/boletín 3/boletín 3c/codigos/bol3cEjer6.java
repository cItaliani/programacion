import java.util.Scanner;

public class bol3cEjer6 {

    public static int funcionD(int a, int b, int c) {
        int mayor;
        if (a >= b && a >= c) {
            mayor = a;
        } else {
            if (b >= c) { // necesita else para que sea otra condicion y no entre en el segundo if
                mayor = b;
            } else {
                mayor = c;
            }
        }
        return mayor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int recoge;

        System.out.print("dime tu primer numero: ");
        num1 = sc.nextInt();
        System.out.print("dime tu segundo numero: ");
        num2 = sc.nextInt();
        System.out.print("dime tu tercer numero: ");
        num3 = sc.nextInt();
        recoge = funcionD(num1, num2, num3);
        System.out.println("tu numero mas alto es:" + recoge);
    }
}
