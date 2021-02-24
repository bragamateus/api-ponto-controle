package io.github.bragamateus.pontocontrole.domain.repository;

import io.github.bragamateus.pontocontrole.domain.model.Alocacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlocacaoRepository extends JpaRepository<Alocacao, Long> {
    @Query("select a from Alocacao a where a.dia >= :inicio and a.dia <= :fim")
    public List<Alocacao> findAlocacaoByPeriodo(@Param("inicio") LocalDate inicio,
                                                @Param("fim")LocalDate fim);
}
