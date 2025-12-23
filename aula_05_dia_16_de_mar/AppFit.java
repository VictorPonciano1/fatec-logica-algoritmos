/* 
Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu 
peso ideal, utilizando as seguintes fórmulas (onde h corresponde a altura):
Homem: (72,7 * h) - 58
Mulher: (62,1 * h) - 44,7 
*/

import java.util.Scanner;

public class AppFit {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o seu sexo:");
        String sexo = scan.nextLine();
        System.out.println("Digite sua altura:");
        double altura = scan.nextDouble();

        double PesoIdealM = (72.7 * altura) - 58;
        double PesoIdealF = (62.1 * altura) - 44.7;

        if (sexo.charAt(0) == 'M' || sexo.charAt(0) == 'm') {
            System.out.println("O seu peso ideal deve ser: " + PesoIdealM);
        } else if (sexo.charAt(0) == 'F' || sexo.charAt(0) == 'f') {
            System.out.println("O seu peso ideal deve ser: " + PesoIdealF);
        } else {
            System.out.println("Digite um genero valido");
        }
        scan.close();
    }
}