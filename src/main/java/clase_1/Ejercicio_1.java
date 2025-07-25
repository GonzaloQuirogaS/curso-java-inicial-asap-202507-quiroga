package clase_1;

//Escribir un programa que lea 1 numero entero por teclado e indique si es multiplo de 2 o de 3.

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0 && num % 3 == 0) {
                System.out.println("El numero " + num + " es multiplo de 2 y de 3");
            } else if (num % 2 == 0) {
                System.out.println("El numero " + num + " es multiplo de 2");
            } else if (num % 3 == 0) {
                System.out.println("El numero " + num + " es multiplo de 3");
            }
        } else {
            System.out.println("El numero " + num + " no puede ser negativo");
        }
    }
}
