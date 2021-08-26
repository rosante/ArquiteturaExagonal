create table car (
    id bigserial not null,
    placa varchar(36) not null,
    tipo varchar(36) not null,
    marca varchar(36) not null,
    modelo varchar(128) not null,
    ano varchar(128) not null,
    cor varchar(128) not null,
    kilometragem integer,
    combustivel varchar(36),
    descricao text,
    vendido Bool not null,
    valor Double precision,
    agencia varchar(128),
    direcaoHidraulica Bool not null,
    cambioAutomatico Bool not null,
    vidroEletrico Bool not null,
    travaEletrica Bool not null,
    som Bool not null,
    alarme Bool not null,
    cameraDeRe Bool not null
);
alter table car add constraint UK_5r88eemotwgru6k0ilqb2ledh unique (placa);