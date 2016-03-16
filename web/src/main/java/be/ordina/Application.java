package be.ordina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by MaBa on 15/03/2016.
 * <p>
 * http://localhost:8080/springBootAngular/
 *
 * @SpringBootApplication
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages="be.ordina")
@EntityScan(basePackages="be.ordina.domain")
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
