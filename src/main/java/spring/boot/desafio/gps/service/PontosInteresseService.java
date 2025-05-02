package spring.boot.desafio.gps.service;

import org.springframework.stereotype.Service;
import spring.boot.desafio.gps.dto.PontosInteresseDTO;
import spring.boot.desafio.gps.model.PontosInteresse;
import spring.boot.desafio.gps.repository.PontosInteresseRepository;

import java.util.List;

@Service
public class PontosInteresseService {
    private final PontosInteresseRepository repository;

    public PontosInteresseService(PontosInteresseRepository repository) {
        this.repository = repository;
    }

    public void salvar(PontosInteresseDTO dto) {
        PontosInteresse ponto = new PontosInteresse(dto.nome(), dto.x(), dto.y());
        repository.save(ponto);
    }

    public List<PontosInteresse> listarTodos() {
        return repository.findAll();
    }

    public List<PontosInteresse> listarPontosProximos(Long x, Long y, Long dmax) {
        long xMin = x - dmax;
        long xMax = x + dmax;
        long yMin = y - dmax;
        long yMax = y + dmax;
        return repository.findPontosInteresseProximos(xMin, xMax, yMin, yMax)
                .stream()
                .filter(p -> distanceEuclidean(x,y,p.getX(), p.getY()) <= dmax)
                .toList();
    }

    private double distanceEuclidean(Long x, Long y, Long x1, Long y1) {
        return Math.sqrt(Math.pow(x - x1,2) + Math.pow(y - y1,2));
    }
}
