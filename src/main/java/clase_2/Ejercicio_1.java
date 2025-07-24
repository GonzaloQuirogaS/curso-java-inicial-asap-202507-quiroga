package clase_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//    Escribir un programa que muestre los N primeros numeros de la serie de Fibonacci.
//    El valor de N se lee por teclado.
//    La serie de fibonacci la forman una serie de numeros tales que:
//    El primer termino de la serie es el numero 1.
//    El segundo termino de la serie es el numero 1.
//    Los siguientes terminos de la serie de fibonacci se obtienen de la suma de los dos anteriores: 1, 1, 2, 3, 5, 8, 13…

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        System.out.println(fibonacci(n));
    }

    public static List<Integer> fibonacci(int n) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(1);

        for (int i = 2; i <= n; i++) {
            int num = lista.get(i - 1) + lista.get(i - 2);
            lista.add(num);
        }
        return lista;
    }
}
