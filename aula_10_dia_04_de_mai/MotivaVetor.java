/* Ler e somar 5 valores */

import java.util.Scanner;

public class MotivaVetor {
    public static void main (String[] args) {

        Scanner  scanner = new Scanner(System.in);
        
        int v1, v2, v3, v4, v5; //Podemos declarar mais de uma variavel do mesmo tipo na mesma linha;

        System.out.println("Digite o valor 1: ");
        v1 = scanner.nextInt();
        System.out.println("Digite o valor 2: ");
        v2 = scanner.nextInt();
        System.out.println("Digite o valor 3: ");
        v3 = scanner.nextInt();
        System.out.println("Digite o valor 4: ");
        v4 = scanner.nextInt();
        System.out.println("Digite o valor 5: ");
        v5 = scanner.nextInt();

        int soma = v1 + v2 + v3 + v4 + v5;

        System.out.println("Resultado de sua soma: " + soma);

        scanner.close();
    }
}