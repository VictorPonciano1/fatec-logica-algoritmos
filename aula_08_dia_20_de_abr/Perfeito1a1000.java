public class Perfeito1a1000 {
    public static void main (String[] args) {

        System.out.println("Numeros perfeitos de 1 a 1000");

        for (int numero = 2; numero <= 1000; numero++) {
            int soma = 1;
            int metade = numero /2; 
            
            for(int i = 2; i <= metade; i++) {
                if (numero % i == 0) {
                    soma = soma + 1;
                }
            }
            if (soma == numero){
                System.out.println(numero);
            } 
        }

    }
}