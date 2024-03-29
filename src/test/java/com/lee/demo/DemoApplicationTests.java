package com.lee.demo;

import com.lee.demo.dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    RedisDao redisDao;

    @Test
    public void testRedis(){
        redisDao.setKey("name","ma");
        redisDao.setKey("age","24");
        System.out.println(redisDao.getValue("name"));
        System.out.println(redisDao.getValue("age"));
    }
}
