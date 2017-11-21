package redis.client.jedis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import static org.junit.Assert.*;

public class RedisStringsTest {

    //Connection parameters
    private String host;
    private int port;
    private String authPass;

    @Before
    public void setUp() throws Exception {
        //initiate connection parameters
        host = "eastmanjian.cn";
        port = 6379;
        authPass = "chuangqianmingyueguang";

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void setGetString() throws Exception {
        //Connect to Redis
        Jedis jedis = new Jedis(host, port);
        jedis.auth(authPass);

        //Test the SET and GET command
        String status = jedis.set("jedisFoo", "jedisBar");
        assertTrue("OK".equals(status));
        String value = jedis.get("jedisFoo");
        assertTrue("jedisBar".equals(value));
    }

}