/* EXERCICIO: CRIE UM CODIGO ONDE AO COLOCAR UMA TEMPERATURA EM GRAUS CELCIUS, ELA SE CONVERTERA EM GRAUS FAHRENHEIT */
import java.util.Scanner;

public class Temperaturas {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        double TC;
        double TF;

        System.out.print("Digite a temperatura em Graus Celcius: ");
        TC = scan.nextDouble();

        TF = 9/5 * TC + 32;

        System.out.println("O resultado em Fahrenheit: " + TF);

        scan.close();
    }
}