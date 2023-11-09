CREATE TABLE IF NOT EXISTS "user" (
   id bigint AUTO_INCREMENT primary key,
   user_name varchar(255) not null,
   user_procedure varchar(255) not null,
   user_day datetime not null
);