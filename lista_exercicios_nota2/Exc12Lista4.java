/* Fazer um programa para ler 5 valores e, em seguida, mostrar todos os valores lidos juntamente com o maior, 
o menor e a media dos valores */

import java.util.Scanner;

public class Exc12Lista4 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] v = new int[5];
        int soma = 0;
        int maiorNumero = 0;
        int menorNumero = 0;
        System.out.println("Digite 5 valores: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println("Valor " + (i+1));
            v[i] = scanner.nextInt();
            soma = soma + v[i];

        }

        for (int i = 0; i < v.length; i++) {
            if (v[i] > maiorNumero) {
                maiorNumero = v[i];
            }

            if (v[i] < menorNumero) {
                menorNumero = v[i];
            }

        }

        int media = soma / 5;
        System.out.println("Media dos valores = " + media);

        System.out.println("Maior valor = " + maiorNumero);
        System.out.println("Menor valor = " + menorNumero);

        System.out.print("Os valores digitados foram: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(v[i] + " ");
        }

        scanner.close();
    }
}
