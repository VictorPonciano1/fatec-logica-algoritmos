import java.util.Scanner;

public class Tabuada {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor para a sua tabuada: ");
        int n = scanner.nextInt();

        int i = 0;

        while (i <= 10) {
            System.out.println(n * i);
            i++;
        }
        scanner.close();
    }
}