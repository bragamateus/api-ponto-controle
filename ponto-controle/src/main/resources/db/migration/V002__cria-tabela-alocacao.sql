create table alocacao (
                          id bigint not null auto_increment,
                          dia date,
                          tempo int,
                          nome_projeto varchar(60) not null,
                          primary key (id)
);