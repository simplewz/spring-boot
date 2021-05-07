package org.simple.boot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BootHelloApplication {

    public static void main(String[] args) {
        /*
        SpringApplicationBuilder builder=new SpringApplicationBuilder(BootHelloApplication.class);
        builder.bannerMode(Banner.Mode.OFF);
        SpringApplication application=builder.build();
        application.run(args);
         */
        SpringApplication.run(BootHelloApplication.class, args);
    }

}
