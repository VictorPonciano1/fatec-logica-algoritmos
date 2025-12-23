/* Ler e somar 5 valores */

import java.util.Scanner;

public class SomaSemArmazenar {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int v, soma = 0;
        System.out.println("Digite 5 valores para soma: ");

        for (int i = 1; i <= 5; i++) {
            System.out.println("");
            v = scanner.nextInt();
            soma = soma + v;
        }
        System.out.println("Resultado da soma: " + soma);

        scanner.close();
    }
}