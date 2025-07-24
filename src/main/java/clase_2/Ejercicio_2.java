package clase_2;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite el primer numero: ");
        int a = sc.nextInt();
        System.out.print("Digite el segundo numero: ");
        int b = sc.nextInt();

        if (amigos(a,b)){
            System.out.println("Los numeros son amigos");
        }else {
            System.out.println("Los numeros no son amigos");
        }
    }

    public static boolean amigos(int a, int b) {
        return totalDivisores(a) == b && totalDivisores(b) == a;
    }

    public static int totalDivisores(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
