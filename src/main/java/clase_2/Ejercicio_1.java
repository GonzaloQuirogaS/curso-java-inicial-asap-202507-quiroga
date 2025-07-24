package clase_2;

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
        if (n >= 0) {
            int a = 1;
            int b = 1;

            for (int i = 1; i <= n; i++) {
                if (i == 1 || i == 2) {
                    System.out.print("1, ");
                } else {
                    int c = a + b;
                    System.out.print(b + ", ");
                    a = b;
                    b = c;
                }
            }
        } else {
            System.out.println("Por favor, digite un número mayor a 0.");
        }
    }
}
