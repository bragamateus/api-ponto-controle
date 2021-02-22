package io.github.bragamateus.pontocontrole.api.controller;

import io.github.bragamateus.pontocontrole.domain.model.Relatorio;
import io.github.bragamateus.pontocontrole.domain.repository.RelatorioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class RelatorioController {

    private RelatorioRepository relatorioRepository;

    @GetMapping("/relatorios/{mes}")
    public Relatorio buscarRelatorio(@PathVariable String mes){
        Optional<Relatorio> relatorio = relatorioRepository.findByMes(mes);

        return relatorio.orElse(null);

    }
}
