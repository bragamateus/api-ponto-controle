package io.github.bragamateus.pontocontrole.domain.model.dto;

import io.github.bragamateus.pontocontrole.domain.model.Alocacao;
import lombok.Data;

import java.time.YearMonth;
import java.util.List;

@Data
public class RelatorioDTO {

    private YearMonth mes;

    private List<DiasTrabalhadosDTO> registros;

    private List<Alocacao> alocacoes;

}
