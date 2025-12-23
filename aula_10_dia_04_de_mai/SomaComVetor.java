/* Ler e somar 5 valores */

import java.util.Scanner;

public class SomaComVetor {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] v = new int[5];
        int soma = 0;
        System.out.println("Digite 5 valores: ");

        for(int i = 0; i < 5; i++) {
            System.out.println("valor " + (i+1));
            v[i] = scanner.nextInt();
            soma = soma + v[i];
        }
        System.out.println("Resultado da soma: " + soma);

        System.out.println("Os valores digitados foram: ");
        for(int i = 0; i < 5; i++) {
            System.out.print(v[i] + " ");
        }

        scanner.close();
    }
}