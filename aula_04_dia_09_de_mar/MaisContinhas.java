/* EXERCICIO: LER 3 VALORES QUAISQUER E MULTIPLICAR O PRIMEIRO PELA SOMA DOS OUTROS DOIS */

import javax.swing.JOptionPane;

public class MaisContinhas {
    public static void main (String[] args) {

        //ENTRADA E LEITURA DE VALORES
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero:"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero:"));
        double z = Double.parseDouble(JOptionPane.showInputDialog("Digite mais um numero:"));

        //PROCESSAMENTO E SAIDA DE VALORES
        JOptionPane.showMessageDialog(null, "Resultado: " + x * (y + z));
    }
}