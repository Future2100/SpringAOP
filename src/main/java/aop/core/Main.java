package aop.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import aop.service.*;
import org.springframework.context.annotation.ImportResource;

//@SpringBootApplication(scanBasePackages = "aop")
@SpringBootApplication()
@ImportResource("classpath:beans.xml")
public class Main implements CommandLineRunner {



    @Autowired
    private TestService testService;

    public void run(String... strings) throws Exception {
        System.out.println(testService.getHelloMessage());
        System.out.println(testService.say("what are you saying??"));
    }

    public static void main(String[] args){
        SpringApplication.run(Main.class,args);
    }
}
