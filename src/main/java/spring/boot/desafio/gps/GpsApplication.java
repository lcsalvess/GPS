package spring.boot.desafio.gps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring.boot.desafio.gps.model.PontosInteresse;
import spring.boot.desafio.gps.repository.PontosInteresseRepository;

@SpringBootApplication
public class GpsApplication implements CommandLineRunner {

    @Autowired
    private PontosInteresseRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(GpsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new PontosInteresse("Lanchonete",27L,12L));
        repository.save(new PontosInteresse("Floricultura",19L,21L));
        repository.save(new PontosInteresse("Joalheria",15L,12L));
        repository.save(new PontosInteresse("Posto",31L,12L));
        repository.save(new PontosInteresse("PUB",12L,8L));
        repository.save(new PontosInteresse("Churrascaria",28L,2L));
        repository.save(new PontosInteresse("Supermercado",23L,6L));
    }
}
