package exercicio;

import redis.clients.jedis.Jedis;

public class Exercicio4 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.lpush("user", "cock", "big", "sick");
        jedis.close();
    }

}
