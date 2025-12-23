//IMPORTANDO A CLASSE SCANNER;
import java.util.Scanner; 

public class LeNumeros {
    public static void main (String[] args) {
        
        //CRIANDO O OBJETO SCANNER;
        Scanner scan = new Scanner(System.in); 

        //DECLARANDO AS VARIAVREIS
        int int1, int2, int3;
        double db1, db2, db3;

        //LENDO O DADOS DECLARADOS PELO USUARIO (ENTRADA DE DADOS);
        System.out.print("Digite o primeiro inteiro: ");
        int1 = scan.nextInt();
        System.out.print("Digite o segundo inteiro: ");
        int2 = scan.nextInt();

        System.out.print("Digite o primeiro double: ");
        db1 = scan.nextDouble();
        System.out.print("Digite o segundo double: ");
        db2 = scan.nextDouble();

        //PROCESSAMENTO DE DADOS;
        int3 = int1 * int2;
        db3 = db1 / db2;

        //SAIDA DE DADOS;
        System.out.println("Multiplicação: " + int1 + " * " + int2 + " = " + int3);
        System.out.println("Divisão: " + db1 + " / " + db2 + " = " + db3);

        scan.close();
    }
}