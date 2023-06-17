package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplicationMain {
    public static void main(String[] args) {

        SpringApplication.run(ConfigClientApplicationMain.class, args);

    }
}
