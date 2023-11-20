package com.wanwan.endscaffold;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wanwan.endscaffold.dao")
public class EndScaffoldApplication {

    public static void main(String[] args) {
        SpringApplication.run(EndScaffoldApplication.class, args);
    }

}
