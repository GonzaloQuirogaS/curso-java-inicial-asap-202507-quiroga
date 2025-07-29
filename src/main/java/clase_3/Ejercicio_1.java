package clase_3;

//  Escribir un programa que lea la altura de N personas y calcule:
//  1. La altura media.
//  2. Cuantas personas tienen una altura superior a la media.
//  3. Cuantas tienen una altura inferior a la media.
//
//  El valor de N se pide por teclado y debe ser entero positivo.

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de personas: ");
        int n = sc.nextInt();

        if (n > 0) {
            Integer[] personas = new Integer[n];
            int media = 0;
            int mayorAMedia = 0;
            int menorMedia = 0;

            for (int i = 0; i < personas.length; i++) {
                System.out.print("Ingrese la altura de la persona " + (i + 1) + " en cm: ");
                personas[i] = sc.nextInt();
            }

            for (int i = 0; i < personas.length; i++) {
                media = personas[i] + media;
            }
            media = media / n;

            for (int i = 0; i < personas.length; i++) {
                if (personas[i] > media) {
                    mayorAMedia++;
                }
                if (personas[i] < media) {
                    menorMedia++;
                }
            }
            System.out.println();
            System.out.println("La media de altura es: " + media);
            System.out.println("Las personas con altura mayor a la media son: " + mayorAMedia);
            System.out.println("Las personas con altura menor  a la media son: " + menorMedia);
        } else {
            System.out.println("Ingrese un valor valido mayor a 0");
        }
    }
}
