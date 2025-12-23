import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos numeros gostaria de ver em sua sequencia:");
        int n = scanner.nextInt();

        int a = 0; //Primeiro termo;
        int b = 1; //Segundo termo;
        int c; //Resultado;
        int counter = 1; //Contador;

        while (counter <= n) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            counter++;
        }

    }
}