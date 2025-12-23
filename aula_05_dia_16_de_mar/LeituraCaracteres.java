//IMPORT DA CLASSE;
import java.util.Scanner;

public class LeituraCaracteres {
    public static void main (String[] args) {

        //CRIAÇÃO DO SCANNER;
        Scanner scan = new Scanner(System.in);
        
        //ENTRADA E PROCESSAMENTO DE DADOS;
        System.out.println("Digite qualquer coisa:");
        String s = scan.nextLine();

        //SAIDA DE DADOS;
        System.out.println("Tamanho da String: " + s.length());
        System.out.println("Primeira letra: " + s.charAt(0));
        System.out.println("Ultima letra: " + s.charAt(s.length()-1));

        //SCANNER FECHADO/LIBERADO;
        scan.close();
    }
}