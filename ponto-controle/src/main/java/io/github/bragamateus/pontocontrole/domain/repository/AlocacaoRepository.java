package io.github.bragamateus.pontocontrole.domain.repository;

import io.github.bragamateus.pontocontrole.domain.model.Alocacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlocacaoRepository extends JpaRepository<Alocacao, Long> {
}
