import java.util.Random;

public class MegaSena {
    public static void main (String[] args) {

        int[] jogo = new int[6];

        Random random = new Random();

        jogo[0] = random.nextInt(60) + 1;

        for (int i = 0; i < jogo.length; i++) {
            int aux = random.nextInt(60) + 1; //Esse + 1 sera usado para que os numeros gerados sejam de 1 a 60 ao inves de 0 a 59;
            
            boolean repete = false;

            for (int j = i - 1; j >= 0 && !repete; j--) {
                if (jogo[j] == aux) {
                    repete = true;
                } 
            }
            if (repete) {
                i--;
            } else {
                jogo[i] = aux;
            }
        }
        System.out.println("\nResultado do jogo: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(jogo[i] + " ");
        }
    }
}