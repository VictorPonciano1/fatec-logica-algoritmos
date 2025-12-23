import java.util.Scanner;

public class ParaContinua {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in); //System.in = Entrada padrão do Java;
        System.out.println("Digite: \"Continua\" para continuar ou qualquer outra coisa para parar.");
        String opcao = scan.nextLine();

        while (opcao.equals("Continua")) { //"Tradução": Enquanto a String "opcao" for igual a "Continuar", algo acontecerá;
            System.out.print("Parar ou Continuar?");
            opcao = scan.nextLine();
        }

        scan.close();
    }
}