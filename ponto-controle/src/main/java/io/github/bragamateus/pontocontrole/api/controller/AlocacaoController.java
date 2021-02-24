package io.github.bragamateus.pontocontrole.api.controller;

import io.github.bragamateus.pontocontrole.domain.model.Alocacao;
import io.github.bragamateus.pontocontrole.domain.repository.AlocacaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AlocacaoController {

    private final AlocacaoRepository alocacaoRepository;

    @PostMapping("/alocacoes")
    public Alocacao alocarHoras(@RequestBody Alocacao alocacao){
        return alocacaoRepository.save(alocacao);
    }

    @GetMapping("/alocacoes")
        public List<Alocacao> listar(){
            return alocacaoRepository.findAll();
        }
    }

