package net.xu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(scanBasePackages = "net.xu")
@ServletComponentScan
public class ApplicationContext {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationContext.class, args);
    }

}