package io.github.bragamateus.pontocontrole.domain.repository;

import io.github.bragamateus.pontocontrole.domain.model.Relatorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RelatorioRepository extends JpaRepository<Relatorio, Long> {
    Optional<Relatorio> findByMes(String mes);
}
