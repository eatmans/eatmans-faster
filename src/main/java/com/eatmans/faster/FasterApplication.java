package com.eatmans.faster;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/6/7
 */

@SpringBootApplication
@MapperScan(basePackages = "com.eatamsn.faster.mapper")
public class FasterApplication {
    public static void main(String[] args) {
        SpringApplication.run(FasterApplication.class, args);
    }

}
