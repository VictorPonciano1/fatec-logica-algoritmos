/* Inverter um numero usando "For" */

import java.util.Scanner;

public class InverteNumeroFor {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero que sera invertido: ");
        int n = scanner.nextInt();

        int i = 0;

        for (; n > 0;) {
            int d = n % 10;
            i = i * 10 + d; 
            n = n / 10;
        }
        System.out.println("Numero Invertido: " + i);

        scanner.close();
    }
}