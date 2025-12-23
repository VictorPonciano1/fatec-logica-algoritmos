/* Gerar um vetor randomico com 100 posicoes com vetores de 0 a 99 e contar quantos VALORES sao pares */

import java.util.Random;

public class VetorRandom100 {
    public static void main (String[] args) {

        Random random = new Random();

        int[] v = new int[100];
        int numerosPares = 0;

        for (int i = 0; i < 100; i++){
            v[i] = random.nextInt(1000);

            if (v[i] % 2 == 0) {
                numerosPares++;
            }
        }
        System.out.println("O numero de pares eh: " + numerosPares);
    }
}