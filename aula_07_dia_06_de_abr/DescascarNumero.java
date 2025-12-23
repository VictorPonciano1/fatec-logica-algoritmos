/* EXERCICIO: Fazer o "descascamento" de um numero, mostrando seus digitos enquanto ele vai sendo divido até chegar em 0 */

import java.util.Scanner;

public class DescascarNumero {
    public static void main (String[] agrs) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int number = scanner.nextInt();

        int operation = number / 10;
        int waste = number % 10;

        while (number > 0) {
            waste = number % 10;
            System.out.println(waste);
            number = number /10;   
        }
        scanner.close();
    }
}