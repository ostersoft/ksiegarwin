package com.ganjasofthouse.ksiegarwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class KsiegarwinApplication {

    public static void main(String[] args) {
        SpringApplication.run(KsiegarwinApplication.class, args);
    }

}
