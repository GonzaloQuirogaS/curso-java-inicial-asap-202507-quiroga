package clase_2;

import java.util.Scanner;

//  Escribir un programa que lea por teclado un numero entero positivo y calcule la suma de sus cifras.
//  Por ejemplo, si se ingresa el numero 3601 el programa debera mostrar: "La suma de sus cifras es: 10".

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite un número: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("El número ingresado debe ser positivo.");
        } else {
            int sum = 0;

            while (n > 0) {
                int a = n % 10;
                sum += a;
                n = n / 10;
            }
            System.out.println("La suma de sus cifras es: " + sum);
        }
    }
}
