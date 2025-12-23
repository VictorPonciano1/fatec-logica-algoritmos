/* EXERCICIO: LER 2 VALORES E DIZER QUAL O MAIOR VALOR DIGITADO */

import javax.swing.JOptionPane;

public class MaiorValor {
    public static void main (String[] args) {

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero:"));

        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "O maior valor digitado é " + numero1, "Resultados", JOptionPane.INFORMATION_MESSAGE);
        } else if (numero1 == numero2) {
            JOptionPane.showMessageDialog(null, "Os valores " + numero1 + " e " + numero2 + " são iguais", "Resultados", 
            JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "O maior valor digitado é " + numero2, "Resultados", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}