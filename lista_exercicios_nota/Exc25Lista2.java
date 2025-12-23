/* Calcular as raizes de uma equacao de segundo grau, onde a raiz = delta; delta = b² - 4ac; 
* "Alpha" necessita ser diferente de 0;
* Se "delta" < 0, nao existe real, imprimir mensagem "nao existe raiz;"
* Se "delta" = 0, existe uma raiz real. Imprima a raiz e a mensagem "raiz unica";
* Se "delta" >= 0, imprima as duas raizes reais;
 */

import java.util.Scanner;

public class Exc25Lista2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        int a = scanner.nextInt();

        System.out.println("Digite o valor de b: ");
        int b = scanner.nextInt();

        System.out.println("Digite o valor de c: ");
        int c = scanner.nextInt();

        int delta = b*b - 4*a*c;
        double raizDelta = Math.sqrt(delta);

        double x1 = (- b + raizDelta) / (2*a);
        double x2 = (- b - raizDelta) / (2*a);

        if(delta < 0) {
            System.out.println("Nao existe raiz");
        } if(delta == 0) {
            System.out.println("raiz unica");
        } if(delta >= 0) {
            System.out.println("Duas raizes: " + x1 + " e " + x2);
        }

        scanner.close();
    }
}
