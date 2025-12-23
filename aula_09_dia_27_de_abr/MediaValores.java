/* Ler uma lista de valores ate que o usuario digite 0, calcular e mostrar sua media */

import java.util.Scanner;

public class MediaValores {
   public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int soma = 0;
    int cont = 0;
    int n;

    do {
        System.out.println("digite seus valores, 0 encerra: ");
        n = scanner.nextInt();
        if (n != 0) {
            soma = soma + n;
            cont++;
        }
    } while (n != 0); //CONTROLE DO LACO;
    if (cont == 0) {
        System.out.println("A lista esta vazia");
    } else {
        double media = (double) soma / cont;
        System.out.println("Media = " + media);
    }

    scanner.close();
    } 
}
