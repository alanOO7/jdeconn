package com.el.jiumaojiu;

import com.jdedwards.system.lib.JdeException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


@ComponentScan("com.el")
@SpringBootApplication
// com.jiaobuchong.business 和 com.jiaobuchong.user.servic 下的类都不会被扫描
//@ComponentScan(basePackages = {"com.el"},
//        excludeFilters = {@ComponentScan.Filter(type = FilterType.REGEX,
//                pattern = "com.sun.enterprise\\..*"),
//                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.sun.corba\\..*"),
//                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.jdedwards\\..*")})
public class JiumaojiuApplication {

    public static void main(String[] args) {

        ApplicationContext context =SpringApplication.run(JiumaojiuApplication.class, args);
//        ApplicationContext context = SpringApplication.run( AppLauncher.class, args );
        String[] beans = context.getBeanDefinitionNames();
//
//        for ( String bean : beans ) {
//            System.out.println( "....................., {}"+ bean );
//        }
    }

}
