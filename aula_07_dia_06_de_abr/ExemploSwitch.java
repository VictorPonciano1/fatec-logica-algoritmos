import java.util.Scanner;

public class ExemploSwitch {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int option = scanner.nextInt(); //COMO A VARIAVEL NAO FOI INSTANCIADA ANTES, INSTANCIEI ELA NO SCANNER;

        switch (option) {
            case 1:
                System.out.println("O numero escolhido foi 1 ");
                break;
            case  2:
                System.out.println("O numero escolhido foi 2");
                break;
            case 3:
                System.out.println("O numero escolhido foi 3");
            default:
                System.out.println("O numero escolhido nao era estava entre as opcoes");
        }

        scanner.close();
    }
}