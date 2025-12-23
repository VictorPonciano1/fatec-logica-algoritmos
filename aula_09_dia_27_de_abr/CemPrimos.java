/* Exibir os 100 primeiros numeros primos que existem */

public class CemPrimos {
    public static void main(String[] args) {
        
        int contaPrimos = 2;
        int n = 2;
        System.out.print(" 2 ");

        do {
            int div = 2;
            int metade = n / 2;
            boolean ePrimo = true;
            do {
                if (n % div == 0) {
                    ePrimo = false;
                }
                div++;
            } while (div <= metade && ePrimo);
            if (ePrimo) {
                System.out.print(n + " ");
                contaPrimos++;
            } 
            n++;
        } while (contaPrimos <= 100);
    }    
}
