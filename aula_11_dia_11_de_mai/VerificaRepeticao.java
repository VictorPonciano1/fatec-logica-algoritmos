import java.util.Random;

public class VerificaRepeticao {
    public static void main (String[] args) {

        Random random = new Random();

        int[] v = new int[12];

        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(2 * v.length); 
            System.out.print(v[i] + " ");
        }

        int i;
        int j = 0;
        boolean repete = false;
        
        for (i = 0; i < v.length - 1 && !repete; i++) {
            for (j = i+1; j < v.length && !repete; j++) {
                if (v[i] == v[j]) {
                    repete = true;
                    System.out.println("\nRepeticoes encontradas nas posicoes: " + i + " , " + j);
                }
            }
        }

        if (repete) {
            System.out.println("\nExistem repeticoes no vetor");
        } else {
            System.out.println("Nao existem repeticoes no vetor");
        }
    }
}