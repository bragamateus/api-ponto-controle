package io.github.bragamateus.pontocontrole.api.controller;

import io.github.bragamateus.pontocontrole.domain.model.Alocacao;
import io.github.bragamateus.pontocontrole.domain.repository.AlocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlocacaoController {

    @Autowired
    private AlocacaoRepository alocacaoRepository;

    @GetMapping("alocacoes")
    public List<Alocacao> listar(){
        return alocacaoRepository.findAll();
    }
}
