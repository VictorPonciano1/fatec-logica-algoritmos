/* Leia 10 numeros inteiros e armazene em um vetor. Em seguida escreva os elementos que sao primos e suas 
respectivas posicoes no vetor */

import java.util.Scanner;

public class Exc27Lista4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] v = new int[10];

        System.out.println("Digite seus 10 valores (acima de 2): ");

        for (int i = 0; i < v.length; i++) {
            System.out.println("Valor " + (i+1));
            v[i] = scanner.nextInt();
        }

        scanner.close();
    }   
}
