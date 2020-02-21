package com.richit;

import redis.clients.jedis.Jedis;
import java.util.Set;

public class Test_jedis {
    public static void main(String[] args) {
        //LOCAL
/*
        Jedis jedis = new Jedis("localhost", 6379);
        //jedis.auth("UnPasswordSuperDificil");
        //System.out.println("ping!: " + jedis.ping()); //Comprueba conexión

        //Obtenemos todas las llaves almacenadas
        Set<String> keys = jedis.keys("*");
        System.out.println("Llaves almacenadas:");
        for (String key :keys) System.out.println(key);

        //Obtenemos archivo emisores
        String file_emisores = jedis.get("emisores");
        System.out.println("\nContenido archivo emisores:\n" + file_emisores);
*/
        //RICH IT

        Jedis jedis = new Jedis("192.168.15.188", 6379);
        jedis.auth("DenMmjv8CZY");
        System.out.println("ping!: " + jedis.ping()); //Comprueba conexión

    }
}
