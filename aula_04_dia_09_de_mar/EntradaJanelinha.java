import javax.swing.JOptionPane; //IMPORTANDO A CLASSE;

public class EntradaJanelinha {
    public static void main (String[] args) {

        //CRIAÇÃO DA VARIAVEL DE ENTRADA;
        String palavra = JOptionPane.showInputDialog("Digite oi:"); 

        //CRIAÇÃO DA VARIAVEL DE SAiDA;
        JOptionPane.showMessageDialog(null, "Você digitou " + palavra); 
    }
}
