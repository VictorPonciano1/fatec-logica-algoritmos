//IMPORT DA CLASSE JOPTIONPANE;
import javax.swing.JOptionPane;

public class LeituraValores {
    public static void main (String[] args) {

        //DECLARAÇÃO DE VARIAVEIS
        String auxiliar;
        int numero;

        //ENTRADA DE DADOS - OPERAÇÃO INT;
        auxiliar = JOptionPane.showInputDialog("Digite um numero:");
        numero = Integer.parseInt(auxiliar);

        int outroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero:"));

        //SAIDA DE DADOS;
        JOptionPane.showMessageDialog(null, "Soma dos Valores = " + (numero + outroNumero));

        //ENTRADA DE DADOS - OPERAÇÃO DOUBLE;
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor decimal:"));

        //SAIDA DE DADOS - OPERAÇÃO DOUBLE;
        JOptionPane.showMessageDialog(null, "Multiplicação de X: " + (3 * x));
    }
}