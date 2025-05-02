package spring.boot.desafio.gps.seeder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.boot.desafio.gps.model.PontosInteresse;
import spring.boot.desafio.gps.repository.PontosInteresseRepository;

@Component
public class DataSeeder implements CommandLineRunner {
    @Autowired
    private PontosInteresseRepository repository;

    @Override
    public void run(String... args) {
        repository.save(new PontosInteresse("Lanchonete", 27L, 12L));
        repository.save(new PontosInteresse("Floricultura", 19L, 21L));
        repository.save(new PontosInteresse("Joalheria", 15L, 12L));
        repository.save(new PontosInteresse("Posto", 31L, 12L));
        repository.save(new PontosInteresse("PUB", 12L, 8L));
        repository.save(new PontosInteresse("Churrascaria", 28L, 2L));
        repository.save(new PontosInteresse("Supermercado", 23L, 6L));
    }

}
