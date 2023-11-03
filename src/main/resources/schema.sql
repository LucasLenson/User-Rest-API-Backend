CREATE TABLE IF NOT EXISTS "user" (
   ID bigint AUTO_INCREMENT primary key,
   Nome varchar(255) not null,
   Procedimento varchar(255) not null,
   Dia datetime not null
);