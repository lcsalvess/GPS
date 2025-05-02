package spring.boot.desafio.gps.dto;

//usado para transferência de dados, especialmente em APIs REST
//evita expor diretamente a entidade JPA
public record PontosInteresseDTO(String nome, Long x, Long y) {
}
