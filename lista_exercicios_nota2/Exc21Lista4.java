/* Faca um programa que receba do usuario dois vetores, A e B, com 10 numeros inteiros cada. Crie um novo vetor 
 * denominado C calculando C = A - B. Mostre na tela os dados do vetor C */

import java.util.Scanner;

public class Exc21Lista4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[10];
        System.out.println("Digite 10 valores (A): ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor " + (i+1));
            a[i] = scanner.nextInt();
        }
        
        int[] b = new int[10];
        System.out.println("Digite 10 valores (B): ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor " + (i+1));
            b[i] = scanner.nextInt();
        }

        int[] c = new int[10];
        System.out.println("O resultado dos valores digitados foram (C): ");
        for (int i = 0; i < 10; i++) {
            c[i] = (a[i] - b[i]); 
            System.out.print(c[i] + " ");
        }

        scanner.close();
    }
}
