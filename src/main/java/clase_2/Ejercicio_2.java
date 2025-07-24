package clase_2;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite el primer numero: ");
        int a = sc.nextInt();
        System.out.print("Digite el segundo numero: ");
        int b = sc.nextInt();

        if (a >= 0 && b >= 0) {
            int sumaA = 0;
            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    sumaA += i;
                }
            }
            int sumaB = 0;
            for (int i = 1; i < b; i++) {
                if (b % i == 0) {
                    sumaB += i;
                }
            }
            if (sumaA == b && sumaB == a) {
                System.out.println(a + " y " + b + " son números amigos.");
            } else {
                System.out.println(a + " y " + b + " no son números amigos.");
            }
        } else {
            System.out.println("Los digitos ingresados no pueden ser negativos");
        }
    }
}
