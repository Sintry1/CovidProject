package Covid19project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Covid19ProjectApplication {

    public static void main(String[] args) {
        System.out.println("I'm going to fail");
        SpringApplication.run(Covid19ProjectApplication.class, args);
    }

}
