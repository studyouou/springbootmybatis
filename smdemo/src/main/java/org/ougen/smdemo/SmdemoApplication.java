package org.ougen.smdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.ougen.smdemo.mapper")
public class SmdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmdemoApplication.class, args);
    }

}
