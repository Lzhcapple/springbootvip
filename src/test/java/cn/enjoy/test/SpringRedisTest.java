
package cn.enjoy.test;

 import cn.enjoy.App;
 import org.junit.Test;
 import org.junit.runner.RunWith;
 import org.springframework.boot.test.context.SpringBootTest;
 import org.springframework.data.redis.core.RedisTemplate;
 import org.springframework.data.redis.core.ValueOperations;
 import org.springframework.test.context.junit4.SpringRunner;

 import javax.annotation.Resource;
 import java.util.concurrent.TimeUnit;


@SpringBootTest(classes = {App.class})
@RunWith(SpringRunner.class)
public class SpringRedisTest {

    @Resource
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void testRedis() throws Exception {
        String name = "name";
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ops.set(name, "enjoy");
        String value = ops.get(name);

        ops.set(name,value,50000, TimeUnit.MILLISECONDS);
        System.out.println(value);
    }
}