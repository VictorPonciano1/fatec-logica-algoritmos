import java.util.Scanner;
import javax.swing.JOptionPane;

public class ContinhasDois {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu numero: ");
        int x = scan.nextInt();

        int y = 10;
        int z = x + y;

       System.out.println("O resultado da conta é: " + z);
    }
}