/* EXERCICIO: LER UM VALOR QUALQUER E DIZER SE ELE É POSITIVO (>= 0) OU NEGATIVO */

import java.util.Scanner;

public class PositivoNegativo {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu numero: ");
        int numero = scan.nextInt();

        if (numero >= 0) {
            System.out.println(numero +" se caracteriza como positivo");
        } else {
            System.out.println(numero + " se caracteriza como negativo");
        }
    }
}