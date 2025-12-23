/* Ler 2 vetores, A e B, compostos por numeros inteiros onde o usuario escolhe o tamamho. Criar um novo vetor C, 
que é igual C = A - B e mostrar na tela os dados do vetor C */

import java.util.Scanner;

public class SubtraiVetores {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        int i;

        System.out.print("Digite o tamanho do vetor, 0 encerra: ");
        n = scanner.nextInt();
        
        while (n > 0) {

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Digite os valores para o primeiro vetor: ");
        for (i = 0; i < n; i++) {
            System.out.print((i+1) + "º valor: ");
            a[i] = scanner.nextInt();
        }

        System.out.println("\nDigite os valores para o segundo vetor: ");
        for (i = 0; i < n; i++) {
            System.out.print((i+1) + "º valor: ");
            b[i] = scanner.nextInt();
        }

        System.out.println("\nResultados do vetor diferenca (subtracao): ");
        for (i = 0; i < n; i++) {
            c[i] = a[i] - b[i];
            System.out.print(c[i] + " ");
        }

        System.out.println("\nDigite o novo tamanho do vator, 0 encerra: ");
        n = scanner.nextInt();
    }

        scanner.close();
    }
}