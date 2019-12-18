package com.sym.dubbo.memberserviceboot;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo//开启dubbo
@SpringBootApplication
public class MemberServiceBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberServiceBootApplication.class, args);
    }

}
