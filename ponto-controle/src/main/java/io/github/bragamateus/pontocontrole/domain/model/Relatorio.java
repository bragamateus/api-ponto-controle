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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Relatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 7)
    private String mes;

    @Column(name = "horas_trabalhadas")
    private String horasTrabalhadas;

    @Column(name = "horas_excedentes")
    private String horasExcedentes;

    @Column(name = "horas_devidas")
    private String horasDevidas;

    @OneToMany
    @JoinColumn(name="registros", referencedColumnName = "id")
    private List<Momento> registros;

    @OneToMany
    @JoinColumn(name="alocacoes", referencedColumnName = "id")
    private List<Alocacao> alocacoes;


}
