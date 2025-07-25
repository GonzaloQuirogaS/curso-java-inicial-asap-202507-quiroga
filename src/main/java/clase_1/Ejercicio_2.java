package clase_1;

// Escribir un programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, anio)
// y calcule su numero de la suerte. El numero de la suerte se calcula sumando
// el dia, mes y anio de la fecha de nacimiento y a continuacion sumando las cifras obtenidas en la suma.
// Por ejemplo: Si la fecha de nacimiento es 12/07/1980
// Calculamos el numero de la suerte asi: 12+7+1980 = 1999 1+9+9+9 = 28
// Numero de la suerte: 28

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la fecha de nacimiento: ");
        System.out.print("Dia: ");
        int dia = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Ano: ");
        int anio = sc.nextInt();

        if (dia > 0 && mes > 0 && anio > 0) {
            int total = dia + mes + anio;

            int sum = 0;

            while (total > 0) {
                int a = total % 10;
                sum += a;
                total = total / 10;
            }
            int numSuerte = sum;

            System.out.println("El numero de la suerte es: " + numSuerte);
        } else {
            System.out.println("La fecha de nacimiento es incorrecta");
        }
    }
}
