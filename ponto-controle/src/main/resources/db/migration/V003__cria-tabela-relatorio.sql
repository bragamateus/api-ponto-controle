create table relatorio(
                          id bigint not null auto_increment,
                          mes varchar(7) not null,
                          horas_trabalhadas varchar(10),
                          horas_excedentes varchar(10),
                          horas_devidas varchar(10),
                          registros bigint not null,
                          alocacoes bigint not null,

                          primary key (id),
                          FOREIGN KEY (registros) REFERENCES momento(id),
                          FOREIGN KEY (alocacoes) REFERENCES alocacao(id)
);