package io.github.bragamateus.pontocontrole.api.controller;

import io.github.bragamateus.pontocontrole.domain.model.Momento;
import io.github.bragamateus.pontocontrole.domain.repository.MomentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MomentoController {

    private final MomentoRepository momentoRepository;

    @PostMapping("/batidas")
    @ResponseStatus(HttpStatus.CREATED)
    public Momento baterPonto(Momento momento){

        return momentoRepository.save(momento);

    }

}
