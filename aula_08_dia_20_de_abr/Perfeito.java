/* Ler um numero e dizer se ele eh perfeito ou nao */

import java.util.Scanner;

public class Perfeito {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Que numero gostaria de ver se eh perfeito?");
        int n = scanner.nextInt(); //Numero que sera lido;

        int s = 1; //Soma;
        int half = n /2; //Metade do numero: sera o "limite" da operacao;

        for(int i = 2; i <= half; i++) {
            if (n % i == 0) {
                s = s + 1;
            }
        }
        if (s == n){
            System.out.println(n + "eh perfeito");
        } else {
            System.out.println("nao eh perfeito");
        }

        scanner.close();
    }
}