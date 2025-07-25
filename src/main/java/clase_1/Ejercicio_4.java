package clase_1;

// Escribir un programa que compruebe si un anio es bisiesto.
// Un anio es bisiesto si es divisible por 4 y no lo es por 100 o si es divisible por 400.

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el año: ");
        int num = sc.nextInt();

        if (num > 0) {
            if ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) {
                System.out.println("El año " + num + " es bisiesto");
            } else {
                System.out.println("El año " + num + " no es bisiesto");
            }
        } else {
            System.out.println("Ingrese un año válido");
        }
    }
}
