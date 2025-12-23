/* Dessa vez, fazer o exercicio de inverter da forma correta */

import java.util.Scanner;

public class InverteNumero2 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero que sera");
        int n = scanner.nextInt();

        int i = 0;

        while (n > 0) {
            int d = n % 10; //O d (digito) sera o resultado da operacao resto;
            i = i * 10 + d; 
            n = n / 10;
        }
        System.out.println("Numero Invertido: " + i);

        scanner.close();
    }
}