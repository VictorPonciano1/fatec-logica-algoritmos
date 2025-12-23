/* EXERCICIO: INVERTER UM NUMERO (SEUS CARACTERES) DE FORMA QUE POR EXEMPLO: 7891 VIRE 1987 */

import java.util.Scanner;

public class InverterNumero {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero que sera invertido: ");
        int number = scanner.nextInt();

        int i = 0;

        while (number > 0) {
            i *= 10;
            i += (number % 10);
            number /= 10;
            }
            System.out.println(i);

        scanner.close();
    }
}