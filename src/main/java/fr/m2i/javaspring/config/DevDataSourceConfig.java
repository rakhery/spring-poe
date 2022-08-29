package fr.m2i.javaspring.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDataSourceConfig implements DataSourceConfig{
    @Override
    public void setup() {
        System.out.println("Setting up for Dev environement");
    }
}
