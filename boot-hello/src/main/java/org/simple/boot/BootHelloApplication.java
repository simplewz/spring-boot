package org.simple.boot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootHelloApplication {

    public static void main(String[] args) {
        /*
        SpringApplicationBuilder builder=new SpringApplicationBuilder(BootHelloApplication.class);
        builder.bannerMode(Banner.Mode.OFF);
        SpringApplication application=builder.build();
        application.run(args);
         */
        //1.返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(BootHelloApplication.class, args);
        //2.获取容器中的所有组件
        String[] names=run.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
    }

}
