/* Gerar um valor entre 1 e 100, deixando o usuário adivinhar o número */

import java.util.Scanner;
import java.util.Random;

public class Adivinhar {
    public static void main (String[] args) {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int chances = 4;
        int sorteado = rand.nextInt(20) + 1;
        System.out.println("Adivinhe um valor entre 1 e 20: ");
        int chute = scan.nextInt();

        while (chute != sorteado) {
            if(chances > 0){
                System.out.println("Voce ainda tem " + chances + " chances disponiveis");
                if(chute > sorteado) {
                    System.out.println("Chute um valor mais baixo:");
                } else {
                    System.out.println("Chute um valor mais alto:");
                }
            } else {
                System.out.println("Acabaram suas chances, para reiniciar deposite 20 reais.");
            }
            chute = scan.nextInt();
            chances = chances - 1;
        }
        System.out.println("Voce acertou");

        scan.close();
    }
}