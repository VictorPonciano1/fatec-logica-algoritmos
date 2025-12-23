/* EXERCICIO: LER UM NUMERO INTEIRO E VERIFICAR SE ELE É PAR OU IMPAR */

import java.util.Scanner;

public class ParImpar {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro:");
        int numero = scan.nextInt();

        int resto = numero % 2;

        if (resto == 0 ) {
            System.out.println(numero + " se caracteriza como par");
        } else {
            System.out.println(numero + " se caracteriza como impar");
        }

        scan.close();
    }
}