-- Creación de la Base de Datos
drop database if exists bdejemplo;
create database bdejemplo;
use bdejemplo;

-- Creación de la tabla persona
create table persona (
    id int auto_increment,
    firstname varchar(60),
    lastname varchar(60),
    email varchar(60),
    primary key(id)
);

-- Inserción de datos de prueba
insert into persona (firstname, lastname, email) 
values("JUAN", "GARCIA", "JGARCIA@UNITRU.EDU.PE");

-- Verificación de datos
select * from persona;
