package exercicio;

import redis.clients.jedis.Jedis;

public class Exercicio3 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        Incr(jedis);
        jedis.close();
    }

    private static void Incr(Jedis jedis) {
        String chave = "programa:execuções";
        long valorAtual = jedis.incr(chave);
        System.out.println("Valor atual da chave '" + chave + "': " + valorAtual);
    }
}
