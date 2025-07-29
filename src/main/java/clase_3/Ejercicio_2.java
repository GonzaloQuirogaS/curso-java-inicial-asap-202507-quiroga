package clase_3;

// Escribir un programa que pida 6 numeros por teclado, los almacene en un array
// y que luego muestre el maximo valor, el minimo y las posiciones que ocupan en el array.

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] nums = new Integer[6];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        int max = nums[0];
        int min = nums[0];
        int posMin = 0;
        int posMax = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                posMax = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                posMin = i;
            }
        }
        System.out.println();
        System.out.println("El numero maximo del array es: " + max + " y se ubica en la posicion: " + posMax);
        System.out.println("El numero minimo del array es: " + min + " y se ubica en la posicion: " + posMin);
    }
}
