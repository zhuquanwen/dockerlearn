package com.iscas.docker.learn1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * //TODO
 *
 * @author zhuquanwen
 * @vesion 1.0
 * @date 2018/7/28 13:56
 * @since jdk1.8
 */
@SpringBootApplication
@RestController
public class Learn1App {
    public static void main(String[] args) {
        SpringApplication.run(Learn1App.class, args);
    }
    @GetMapping("/test1")
    public String test1(){
        System.out.println(111);
        return "test1";
    }
}
