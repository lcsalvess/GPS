package spring.boot.desafio.gps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import spring.boot.desafio.gps.model.PontosInteresse;

import java.util.List;

public interface PontosInteresseRepository extends JpaRepository<PontosInteresse, Long> {

    @Query(
            """
                    SELECT p FROM PontosInteresse p
                    WHERE (p.x >= :xMin AND p.x <= :xMax AND p.y >= :yMin AND p.y <= :yMax)
                    """
    )
    List<PontosInteresse> findPonrosInteresseProximos
            (@Param("xMin") long xMin,
             @Param("xMax") long xMax,
             @Param("yMin") long yMin,
             @Param("yMax") long yMax
            );
}
