/* EXERCICIO 06: Fazer um programa que recebe tres numeros inteiros, calcula e mostra a soma desses numeros. */

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n1;
        int n2;
        int n3;

        System.out.println("Digite o primeiro numero:");
        n1 = scanner.nextInt();

        System.out.println("Digite o segundo numero:");
        n2 = scanner.nextInt();

        System.out.println("Digite o terceiro numero:");
        n3 = scanner.nextInt();

        System.out.println("A soma desses 3 numeros eh igual a: " + (n1 + n2 + n3));

        scanner.close();
    }
}
