package fr.m2i.javaspring;

import fr.m2i.javaspring.entities.Employee;
import fr.m2i.javaspring.repository.EmployeeRepo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class JavaspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaspringApplication.class, args);
    }


    //Données d'initialisation

}
