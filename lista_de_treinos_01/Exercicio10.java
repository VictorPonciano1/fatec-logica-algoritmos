/* EXERCICIO 11: Fazer um programa que calcula e mostra a área de um trinângulo 
sabendo que: Area = (base * altura)/2 */

import java.util.Scanner;

public class Exercicio10 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        double base;
        double height;
        
        System.out.println("Digite qual a base do trângulo:");
        base = scanner.nextDouble();

        System.out.println("Digite qual a altura do triângulo:");
        height = scanner.nextDouble();

        System.out.println("A área desse triângulo é: " + (base * height)/2);

        scanner.close();
    }
}