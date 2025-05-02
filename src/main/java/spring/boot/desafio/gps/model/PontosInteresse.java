package spring.boot.desafio.gps.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tb_pontos_interesse")
public class PontosInteresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Long x;
    private Long y;

     public PontosInteresse(String nome, Long x, Long y) {
        this.nome = nome;
        this.x = x;
        this.y = y;
     }
}
