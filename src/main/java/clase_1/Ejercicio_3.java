package clase_1;

// Escribir un programa lea por teclado una calificacion numerica entre 0 y 10 y muestre por pantalla
// su correspondiente calificacion alfabetica.
// La equivalencia entre la calificacion numerica y la alfabetica se muestra en esta tabla:
// 0 <= nota < 5 Insuficiente
// 5 <= nota < 6 Suficiente
// 6 <= nota < 7 Bien
// 7 <= nota < 9 Notable
// 9 <= nota <= 10 Sobresaliente
// La calificacion numerica que se introduce por teclado debe estar comprendida entre 0 y 10 para poder obtener
// su equivalente calificacion alfabetica. Si la calificacion introducida no es valida se muestra un mensaje indicandolo
// y el programa finaliza.

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero entre 0 y 10: ");
        int num = sc.nextInt();

        if (num>=0 && num <=10){
            if (num >=0 && num <= 5){
                System.out.println("Insuficiente");
            }else if (num >=5 && num <= 6){
                System.out.println("Suficiente");
            } else if (num >=6 && num <= 7){
                System.out.println("Bien");
            } else  if (num >=7 && num <= 9){
                System.out.println("Notable");
            } else  if (num >=9 && num <= 10) {
                System.out.println("Sobresaliente");
            }
        }  else {
            System.out.println("La calificacion introducida no es valida.");
        }
    }
}
