package redis.client.jedis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import static org.junit.Assert.*;

public class RedisStringsTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void setGetSring() throws Exception {
        Jedis jedis = new Jedis("eastmanjian.cn", 6379);
        jedis.auth("chuangqianmingyueguang");
        String status = jedis.set("jedisFoo", "jedisBar");
        assertTrue("OK".equals(status));
        String value = jedis.get("jedisFoo");
        assertTrue("jedisBar".equals(value));
    }

}