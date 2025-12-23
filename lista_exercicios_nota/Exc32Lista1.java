/* Leia um numero inteiro e imprima a soma do sucessor do seu triplo com o antecessor do seu dobro */

import java.util.Scanner;

public class Exc32Lista1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu numero inteiro: ");
        int n = scanner.nextInt();

        int triploN = n * 3;
        int sucessorTriplo = triploN + 1;
        int dobroN = n * 2;
        int antecessorDobro = dobroN - 1;
        int soma = sucessorTriplo + antecessorDobro;

        System.out.println("Resultado da soma: " + soma);

        scanner.close();
    }
}