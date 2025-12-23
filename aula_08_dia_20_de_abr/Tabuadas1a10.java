import javax.swing.JOptionPane;

public class Tabuadas1a10 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            
            String saida = "";

            for (int j = 1; j <= 10; j++) {

                saida = saida + 
                String.format("%2d", i) + " x " +
                String.format("%2d", j) + " = " +
                String.format("%3d", i*j) + "\n";

            }
            JOptionPane.showMessageDialog(null, saida, "Tabuada do " + i, JOptionPane.PLAIN_MESSAGE);
        }
    }
}