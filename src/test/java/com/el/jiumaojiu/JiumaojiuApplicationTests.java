package com.el.jiumaojiu;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JiumaojiuApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.library.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));
        System.out.println("d");
    }

}