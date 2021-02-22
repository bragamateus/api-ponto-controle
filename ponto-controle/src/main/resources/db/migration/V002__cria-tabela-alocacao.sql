create table alocacao (
                          id bigint not null auto_increment,
                          dia date,
                          tempo time,
                          nome_projeto varchar(60) not null,
                          primary key (id)
);