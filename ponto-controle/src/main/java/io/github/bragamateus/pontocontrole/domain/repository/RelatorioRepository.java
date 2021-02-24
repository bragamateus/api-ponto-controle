package io.github.bragamateus.pontocontrole.domain.repository;

import io.github.bragamateus.pontocontrole.domain.model.Relatorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelatorioRepository extends JpaRepository<Relatorio, Long> {
}
