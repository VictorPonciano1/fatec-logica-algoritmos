import java.util.Scanner;

public class TabuadaFor {
    public static void main (String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da sua tabuada: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%2d x %2d = %3d\n", n, i, n*i);
        }
        scanner.close();
    }
}