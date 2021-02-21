package io.github.bragamateus.pontocontrole.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Relatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mes;

    @Column(name = "horas_trabalhadas")
    private LocalTime horasTrabalhadas;

    @Column(name = "horas_excedentes")
    private LocalTime horasExcedentes;

    @Column(name = "horas_devidas")
    private LocalTime horasDevidas;


}
