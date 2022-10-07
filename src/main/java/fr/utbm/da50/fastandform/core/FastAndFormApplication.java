package fr.utbm.da50.fastandform.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FastAndFormApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastAndFormApplication.class, args);
    }

}
