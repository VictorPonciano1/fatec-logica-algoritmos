import java.util.Random;
import java.util.Scanner;

public class ListaDeBusca {
    public static void main (String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("Digite o tamanho do seu vetor, 0 encerra: ");
        n = scanner.nextInt();

        while (n > 0) {
            int[] v = new int[n];

            for (int i = 0; i < v.length; i++) {
                v[i] = random.nextInt(10 * v.length); //Parametrizando o "limite" de numeros randomicos com o tamanho do vetor;
                System.out.print(v[i] + " ");
            }
            
            int maior = v[0];
            for (int i = 1; i < v.length; i++) {
                if (v[i] > maior) {
                    maior = v[i];
                }
            }

            System.out.println("\nMaior valor da lista: " + maior);
            System.out.println("Escolha um novo tamanho para o vetor, 0 encerra: ");
            
            n = scanner.nextInt();
        }

        scanner.close();
    }
}