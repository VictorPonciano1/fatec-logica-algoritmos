//Código 2 para treino da sintaxe Java - autor: Victor Ponciano ADS 1ºCiclo;

public class Continhas {

    public static void main (String[] args){

        //Operação: soma;
        int x = 12;
        int y = 12;
        int z;

        z = x + y;

        System.out.println("O valor da conta feita é: " + z);

        //Operação: divisão;
        int a = 10;
        int b = 2;
        double divisao;

        divisao = a / b;

        System.out.println("O resultado da divisão é: " + divisao);

        //Operação: resto de divisão;
        int j = 17;
        int k = 3;
        double l;

        l = 17 % 3;

        System.out.println("O resto de divisão foi: " + l);

        //Operação: divisão double forçada;
        int o = 17;
        int p = 3;
        double q = (double)o / 3;

        System.out.println(q);
    }
}