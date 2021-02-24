package io.github.bragamateus.pontocontrole.domain.repository;

import io.github.bragamateus.pontocontrole.domain.model.Momento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface MomentoRepository extends JpaRepository<Momento, Long> {

    @Query("select m from Momento m where m.dataHora >= :inicio and m.dataHora <= :fim")
    public List<Momento> findByPeriodo(@Param("inicio") LocalDateTime inicio, @Param("fim")LocalDateTime fim);

}
