package io.github.bragamateus.pontocontrole.api.controller;

import io.github.bragamateus.pontocontrole.domain.model.Alocacao;
import io.github.bragamateus.pontocontrole.domain.model.dto.AlocacaoDTO;
import io.github.bragamateus.pontocontrole.domain.repository.AlocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlocacaoController {

    @Autowired
    private AlocacaoRepository alocacaoRepository;

    @PostMapping("/alocacoes")
    public Alocacao alocarHoras(@RequestBody Alocacao alocacao){
        return alocacaoRepository.save(alocacao);
    }

    @GetMapping("/alocacoes")
        public List<Alocacao> listar(){
            return alocacaoRepository.findAll();
        }
    }

