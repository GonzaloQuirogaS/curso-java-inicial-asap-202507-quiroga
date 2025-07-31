package clase_4;

//Programa que pide el ingreso de un numero e indica si es un numero primo o no.

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int n = sc.nextInt();

        System.out.println(esPrimo(n) ? "El numero es primo" : "El numero no es primo");
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}