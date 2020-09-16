package com.lvtemporary;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class, scanBasePackages = {"com.lvtemporary.*"})
@MapperScan("com.lvtemporary.dao")
@EnableScheduling
public class LvtemporaryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LvtemporaryApplication.class, args);
    }

}
