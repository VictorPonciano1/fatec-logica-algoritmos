/* NOTA: A Classe "Math"  faz parte do diretório/biblioteca; Java.lang então ele não precisa ser importado, já a classe "Random"
faz parte do diretório "util", precisando ser importada; */

import java.util.Random;

public class TesteRandomico {
    public static void main (String[] args){

        //Classe Math;
        System.out.println("Usando a classe Math + Método random()");
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*10)); //Casting: Conversão de tipos (algo que seria "String" vira Int, como o número 10);
        System.out.println((int)(Math.random()*1000));

        //Classe Random;
        Random rand = new Random();
        System.out.println("Usando a Classe Random:");
        System.out.println(rand.nextInt());
        System.out.println(rand.nextDouble());
        System.out.println(rand.nextBoolean());
        System.out.println(rand.nextInt(100));
    }
}