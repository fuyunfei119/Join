package com.example.mysql;

import com.example.mysql.Dao.BusinessCentralMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MySqlApplicationTests {

    @Autowired
    private BusinessCentralMapper businessCentralMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void test() {
        System.out.println(businessCentralMapper.FindSet());
    }

}
