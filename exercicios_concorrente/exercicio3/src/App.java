
/**Faça um programa que gere um array de 1 bilhão de números inteiros aleatórios e faça as seguintes tarefas:

Some todos os valores de forma sequencial e meça o tempo de execução;
Some todos os valores de forma concorrente com 10 threads e meça o tempo de execução;
Some todos os valores de forma concorrente com 100 threads e meça o tempo de execução.
Responda as seguintes perguntas:
Qual foi o speedup1 obtido?
Teve algum caso que o speedup foi negativo?
Repita os testes acima usando Threads virtuais.
Houve diferenças entre Threads de plataforma e Threads virtuais? Se houve, quais foram e explique o porquê das diferenças. */

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random =  new Random();
        int array[] = new int[1000000000];

        for (int i = 0; i<array.length; i++){
            array[i] = random.nextInt(100);
        }
        System.out.println("Array gerado...");

        long contadorComeco = System.currentTimeMillis();

        long somaSequencial = somaSequencial(array);

        long contadorFinal = System.currentTimeMillis();

        long contadorTotal = contadorFinal - contadorComeco;

        System.out.println("Soma sequencial = " + somaSequencial + " Tempo = " + contadorTotal + "ms");

        
    }

    static long somaSequencial(int[] array) {
        long sum = 0;
        for (int v : array) {
            sum += v;
        }
        return sum;
    }

}
