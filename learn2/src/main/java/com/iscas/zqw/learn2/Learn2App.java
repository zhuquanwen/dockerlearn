package com.iscas.zqw.learn2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * //TODO
 *
 * @author zhuquanwen
 * @vesion 1.0
 * @date 2018/8/3 17:30
 * @since jdk1.8
 */
@SpringBootApplication
@RestController
public class Learn2App {
    @Autowired
    private DataSource dataSource;
    public static void main(String[] args) {
        SpringApplication.run(Learn2App.class, args);
    }
    @GetMapping("/test")
    public String test(){
        return dataSource.toString();
    }
}
