/* Fazer o usuario escolher o tamanho do vetor, gerar de forma randomica seus valores e exibi-los na ordem inversa */

import java.util.Scanner;
import java.util.Random;

public class EscolheTamanho {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor, 0 encerra: ");
        int tamanho = scanner.nextInt();

        while(tamanho > 0)  {
            int[] v = new int[tamanho];
            Random random = new Random();

            for (int i = 0; i < tamanho; i++) {
                v[i] = random.nextInt(100);
            }

            System.out.println("Valores na ordem inversa: ");
            for (int i = tamanho - 1; i >=0; i--) {
                System.out.print(v[i] + " ");
            }

            System.out.println("\nDigite o tamanho do vetor, 0 encerra: ");
            tamanho = scanner.nextInt();
        }

        scanner.close();
    }
}