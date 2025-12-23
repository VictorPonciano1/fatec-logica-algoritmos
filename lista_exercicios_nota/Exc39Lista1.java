/* A importancia de RS780000.00 sera dividida entre tres ganhadores de um concurso, sendo que da quantia total: 
 * - O primeiro ganhador recebera 46%
 * - O segundo recebera 32%
 * - O terceiro recebera o resto
*/

public class Exc39Lista1 {
    public static void main(String[] args) {
        
        //PREMIO;
        double premio = 780000.00;

        //GANHADOR 1;
        double ganhador1 = premio * 0.46;
        System.out.println("O primeiro ganhador vai receber: " + ganhador1);

        //GANHADOR 2;
        double ganhador2 = premio * 0.32;
        System.out.println("O segundo ganhador vai receber: " + ganhador2);

        //GANHADOR 3;
        double ganhador3 = premio - (ganhador1 + ganhador2);
        System.out.println("O terceiro ganhador vai receber: " + ganhador3);
    }
}
