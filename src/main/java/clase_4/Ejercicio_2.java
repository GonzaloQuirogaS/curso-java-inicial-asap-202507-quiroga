package clase_4;

// Programa que genera un array de 8 enteros aleatorios entre 1 y 10,
// lo ordena utilizando el algoritmo de ordenamiento de burbuja y lo muestra.

import java.util.Arrays;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int[] array = randomArray();
        System.out.println("El array desordenado es: " + Arrays.toString(array));
        System.out.println("El array ordenado es: " + Arrays.toString(ordenarArray(array)));
    }

    public static int[] ordenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }

    public static int[] randomArray() {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
        }
        return array;
    }
}