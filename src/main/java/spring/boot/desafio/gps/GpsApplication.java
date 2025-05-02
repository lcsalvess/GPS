package spring.boot.desafio.gps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring.boot.desafio.gps.model.PontosInteresse;
import spring.boot.desafio.gps.repository.PontosInteresseRepository;

@SpringBootApplication
public class GpsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GpsApplication.class, args);
    }
}
