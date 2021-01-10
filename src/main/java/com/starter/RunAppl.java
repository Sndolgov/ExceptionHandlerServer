package com.starter;


import com.starter.service.PSRService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RunAppl
{
    public static void main(String[] args)
    {
        ConfigurableApplicationContext context = SpringApplication.run(RunAppl.class);
        PSRService p = context.getBean(PSRService.class);
        p.isPositive();
    }
}
