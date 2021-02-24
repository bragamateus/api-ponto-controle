package io.github.bragamateus.pontocontrole.domain.model.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
public class DiasTrabalhadosDTO {

    private LocalDate dia;

    private List<LocalTime> horarios;

}
