import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        //COMO AS VARIAVEIS JA ESTAO DEFINIDAS AQUI, NAO PRECISA INSTANCIA-LAS NO SCANNER;
        double n1;
        double n2;
        char option;

        System.out.println("Escolha a operacao desejada: + (soma) , - (subtracao) , * (multiplicacao) , / (divisao)");
        option = scanner.nextLine().charAt(0); //EXEMPLO DE VARIAVEL SEM INSTANCIAMENTO;

        switch (option) {
            case '+':
                System.out.println("Digite o primeiro valor: ");
                n1 = scanner.nextDouble();
                System.out.println("Digite o segundo valor: ");
                n2 = scanner.nextDouble();
                System.out.println("Soma = " + (n1 + n2));
                break;
            case '-':
                System.out.println("Digite o primeiro valor: ");
                n1 = scanner.nextDouble();
                System.out.println("Digite o segundo valor: ");
                n2 = scanner.nextDouble();
                System.out.println("Subtracao = " + (n1 - n2));
                break;
            case '*':
                System.out.println("Digite o primeiro valor: ");
                n1 = scanner.nextDouble();
                System.out.println("Digite o segundo valor: ");
                n2 = scanner.nextDouble();
                System.out.println("Multiplicacao = " + (n1 * n2));
                break;
            case '/':
                System.out.println("Digite o primeiro valor: ");
                n1 = scanner.nextDouble();
                System.out.println("Digite o segundo valor: ");
                n2 = scanner.nextDouble();
                    if (n2 != 0) {
                        System.out.println("Divisao = " + (n1 / n2)); 
                    } else {
                        System.out.println("Impossivel dividir por 0");
                    }
                break;
            default:
                System.out.println("Not a valid Operation");
        }

        scanner.close();
    }
}