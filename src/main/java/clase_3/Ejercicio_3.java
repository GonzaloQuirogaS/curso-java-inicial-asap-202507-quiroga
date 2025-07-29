package clase_3;

// Escribir un programa que pida 5 numeros enteros, los almacene en un array,
// e indique por pantalla si dicho array es capicua.

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        boolean isCapicua = true;

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[nums.length - 1 - i]) {
                isCapicua = false;
            }
        }
        if (isCapicua) {
            System.out.println("Los numeros son capicua");
        } else {
            System.out.println("Los numeros no son capicua");
        }
    }
}