/* O programa deve ler o codigo do produto escolhido do cardapio de uma lanchonete e a quantidade. O programa deve
 * calcular o valor a ser pago por aquele lanche. Considere que a cada execução somente sera calculado um pedido.
 */

import java.util.Scanner;

public class Exc32Lista2 {
    public static void main(String[] args) {
        
        System.out.println("Voce pode escolher os produtos abaixo (segue seu codigo para escolha):\n"
         + "Codigo: 100 / Produto: Cachorro Quente / Preco: 1.20\n" + "Codigo: 101 / Produto: Bauru Simples / "
         + "Preco: 1.30\n" + "Codigo: 102 / Produto: Bauru com Ovo / Preco: 1.50\n" + "Codigo: 103 / " 
         + "Produto: Hamburguer / Preco: 1.20\n" + "Codigo: 104 / Produto: Cheeseburguer / Preco: 1.70\n" 
         + "Codigo: 105 / Produto: Suco / Preco:2.20\n" + "Codigo: 106 / Produto: Refrigerante / Preco: 1.00");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Codigo do produto escolhido: ");
        int n = scanner.nextInt();

        System.out.println("Digite agora a quantidade: ");
        int q = scanner.nextInt();

        switch(n) {
            case 100:
            System.out.println("Voce escolheu " + q + " cachorro(s) quente(s) e vai pagar: " + (q * (1.20)));
            break;
            case 101:
            System.out.println("Voce escolheu " + q + " Bauru(s) Simples e vai pagar: " + (q * (1.30)));
            break;
            case 102:
            System.out.println("Voce escolheu " + q + " Bauru(s) com Ovo e vai pagar: " + (q * (1.50)));
            break;
            case 103:
            System.out.println("Voce escolheu " + q + " Hamburguer(es) e vai pagar: " + (q * (1.20)));
            break;
            case 104:
            System.out.println("Voce escolheu " + q + " Cheeseburguer(es) e vai pagar: " + (q * (1.70)));
            break;
            case 105:
            System.out.println("Voce escolheu " + q + " Suco(s) e vai pagar: " + (q * (2.20)));
            break;
            case 106:
            System.out.println("Voce escolheu " + q + " Refrigerante(s) e vai pagar: " + (q * (1.00)));
            break;
            default:
            System.out.println("Escolha um produto valido");
        }

        scanner.close();
    }
}
