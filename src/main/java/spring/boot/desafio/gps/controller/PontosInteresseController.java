package spring.boot.desafio.gps.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.boot.desafio.gps.model.PontosInteresse;
import spring.boot.desafio.gps.dto.PontosInteresseDTO;
import spring.boot.desafio.gps.service.PontosInteresseService;

import java.util.List;

//endpoints HTTP
@RestController
public class PontosInteresseController {
    private final PontosInteresseService service;

    public PontosInteresseController(PontosInteresseService service) {
        this.service = service;
    }

    @PostMapping("/pontos-de-interesse")
    public ResponseEntity<Void> pontosInteresseCriar (@RequestBody PontosInteresseDTO body) {
        service.salvar(body);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/listar/pontos-de-interesse")
    public ResponseEntity<List<PontosInteresse>> pontosInteresseListar() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("listar/pontos-proximos")
    public ResponseEntity<List<PontosInteresse>> pontosProximos(
            @RequestParam Long x,
            @RequestParam Long y,
            @RequestParam Long dmax) {
        return ResponseEntity.ok(service.listarPontosProximos(x, y, dmax));
    }
}
