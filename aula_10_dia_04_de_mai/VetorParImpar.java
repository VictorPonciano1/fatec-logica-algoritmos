/* Ler um vetor de tamanho 10: exibir os elementos das posições pares, somar os valores das posições impares e exibir o resultado */

import java.util.Scanner;

public class VetorParImpar {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] v = new int[10];
        System.out.println("Digite 10 valores pro vetor: ");
        for(int i = 0; i < 10; i++) {
            System.out.print("Posicao " + i + ": ");
            v[i] = scanner.nextInt();
        }

        System.out.println("Elementos das posicoes pares: ");
        int soma = 0;
        for (int i = 0; i < 10; i += 2) {
            System.out.println(v[i] + " ");
            soma += v[i+1];
        }

        System.out.println("Soma dos elementos das posicoes impares: " + soma);
    }
}