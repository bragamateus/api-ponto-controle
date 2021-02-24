create table relatorio(
                          id bigint not null auto_increment,
                          mes varchar(7) not null,
                          horas_trabalhadas varchar(10),
                          horas_excedentes varchar(10),
                          horas_devidas varchar(10),
                          momento_id bigint not null,
                          alocacao_id bigint not null,

                          primary key (id),
                          FOREIGN KEY (momento_id) REFERENCES momento(id),
                          FOREIGN KEY (alocacao_id) REFERENCES alocacao(id)
);