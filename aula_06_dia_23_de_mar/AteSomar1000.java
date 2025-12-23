/* Ler valores até que a soma deles atinja "1000" */

import java.util.Scanner;

public class AteSomar1000 {
    public static void main (String[] args) {

        int soma = 0;
        int i;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seus vaores até chegar em 1000: ");
        i = scan.nextInt();
        soma = soma + i;

        while (soma < 1000) {
            System.out.print("Voce atingiu: " + soma);
            System.out.println("\nDigite outro valor para chegar em 1000: ");
            i = scan.nextInt();
            soma = soma + i;
        }

        scan.close();

        System.out.print("Voce antingiu: " + soma + ", e chegou ao valor desejado");
    }
}