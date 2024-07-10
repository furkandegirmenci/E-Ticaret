package com.eticaret.eticaretprojesi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.eticaret")
public class ETicaretProjesiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ETicaretProjesiApplication.class, args);
    }

}
