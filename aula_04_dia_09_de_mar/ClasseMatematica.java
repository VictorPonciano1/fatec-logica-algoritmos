/* EXERCICIO: LER UM VALOR DOUBLE, CALCULAR E MOSTRAR SUA RAIZ QUADRADA E O VALOR AO CUBO */

import javax.swing.JOptionPane;

public class ClasseMatematica {
    public static void main (String[] args) {

        //DECLARAÇÃO DA VARIAVEL E ENTRADA DE VALORES;
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero qualquer:"));

        //PROCESSAMENTO DE VALORES/DADOS;
        double raiz = Math.sqrt(x); //SQRT: SQUARE ROOT = RAIZ QUADRADA;
        double potencia = Math.pow(x, 2); //POW: POWER = POTENCIAÇÃO;

        //EXIBIÇÃO E SAIDA DE RESULTADOS;
        String saida = "Raiz de " + x + " = " + raiz + "\n" + "A Potenciação de " + x + " = " + potencia;
        JOptionPane.showMessageDialog(null, "Meus resultados foram: " + saida);
    }
}