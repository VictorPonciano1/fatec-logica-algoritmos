/* EXERCICIO: LER UMA LISTA DE VALORES ATÉ QUE O USUARIO DIGITE 0, CONTAR E MOSTRAR QUANTOS SAO PARES */

import java.util.Scanner;

public class ContaPares {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        double numbers;
        int pares = 0;

        System.out.println("Digite um numero, 0 encerra o teste:");
        numbers = scanner.nextDouble();
        while (numbers != 0) {
            if(numbers % 2 == 0){
                pares++;
            }
            System.out.println("Digite um numero, 0 encerra o teste: ");
            numbers = scanner.nextDouble();
        }
        System.out.println("Foram digitados " + pares + " numeros pares");

        scanner.close();
    }
}