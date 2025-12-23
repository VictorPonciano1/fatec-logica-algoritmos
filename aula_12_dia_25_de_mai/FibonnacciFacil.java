import java.util.Scanner;

public class FibonnacciFacil {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        int termo1 = 0;
        int termo2 = 1;
        int proximoTermo;

        System.out.println("Digite o tamanho da sua sequencia, 0 encerra: ");
        n = scanner.nextInt();

        while (n > 0) {
            proximoTermo = (termo1 + termo2);
            System.out.print(proximoTermo + " ");
            termo1 = termo2;
            termo2 = proximoTermo;
            n--;
        }
    }
}