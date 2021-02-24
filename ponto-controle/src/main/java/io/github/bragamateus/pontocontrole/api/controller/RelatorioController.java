package io.github.bragamateus.pontocontrole.api.controller;

import io.github.bragamateus.pontocontrole.domain.model.Momento;
import io.github.bragamateus.pontocontrole.domain.model.Relatorio;
import io.github.bragamateus.pontocontrole.domain.model.dto.DiasTrabalhadosDTO;
import io.github.bragamateus.pontocontrole.domain.model.dto.RelatorioDTO;
import io.github.bragamateus.pontocontrole.domain.repository.MomentoRepository;
import io.github.bragamateus.pontocontrole.domain.repository.RelatorioRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Tuple;
import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


@AllArgsConstructor
@RestController
public class RelatorioController {

    private final MomentoRepository momentoRepository;

    @GetMapping("/relatorios/{mes}") public RelatorioDTO buscarRelatorio(@Valid @PathVariable("mes") YearMonth mes){

        LocalDateTime primeiroDiaMes = LocalDateTime.of(mes.atDay(1), LocalTime.of(0,0,0));

        //pegar horário
        LocalDateTime ultimoDiaMes = primeiroDiaMes.with(TemporalAdjusters.lastDayOfMonth());

        List<Momento> momentos = momentoRepository.findByPeriodo(primeiroDiaMes, ultimoDiaMes);


        final Map<LocalDate, List<Momento>> mapMomento = momentos.stream()
                .collect(Collectors.groupingBy(e -> e.getDataHora().toLocalDate(), Collectors.toList()));

        RelatorioDTO relatorioDTO = new RelatorioDTO();
        relatorioDTO.setRegistros(new ArrayList<>());

        mapMomento.keySet().forEach(e -> {
            final DiasTrabalhadosDTO diasTrabalhadosDTO = new DiasTrabalhadosDTO();
            List<Momento> momentosDia = mapMomento.get(e);
            diasTrabalhadosDTO.setDia(e);
            List<LocalTime> horarios = new ArrayList<>();

            momentosDia.forEach(c -> horarios.add(c.getDataHora().toLocalTime()));
            diasTrabalhadosDTO.setHorarios(horarios);
            relatorioDTO.getRegistros().add(diasTrabalhadosDTO);
        });

        return relatorioDTO;

    }
}
