package fr.m2i.javaspring;

import fr.m2i.javaspring.config.DataSourceConfig;
import fr.m2i.javaspring.entities.Employee;
import fr.m2i.javaspring.repository.EmployeeRepo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class JavaspringApplication {

    public static void main(String[] args) {

        ApplicationContext ctx=SpringApplication.run(JavaspringApplication.class, args);

        //Ici on peut appleller Config selon notre config
        DataSourceConfig dataConfig=ctx.getBean(DataSourceConfig.class);
        dataConfig.setup();
    }



}
