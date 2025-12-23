/* EXERCICIO 04: Ler um numero e verificar se ele eh impar ou par */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu numero:");
        double number = scanner.nextDouble();

        if (number % 2 == 0) {
            System.out.println("Seu numero eh par");
        } else {
            System.out.println("Seu numero eh impar.");
        }

        scanner.close();
    }
}
