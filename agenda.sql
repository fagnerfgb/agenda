/**
* Agenda de Contatos
* @author Fagner Geraldes Braga
*/
-- Comando para verificar os bancos criados
show databases;

-- Comando para criar um novo banco de dados
create database agenda;

-- Comando usado para selecionar um banco de dados
use agenda;

-- Comando usado para excluir um banco de dados
drop database agenda;

-- Comando usado para criar uma tabela
-- int (inteiros)
-- primary key (chave primária - identificador)
-- auto_increment (numeração automática)
-- varchar(50) (tipo de dados string - 50 caracteres)
-- not null (campo obrigatório)
create table contatos(
id int primary key auto_increment,
nome varchar(50) not null,
fone varchar(15) not null,
email varchar(50)
);

-- Verificar tabelas do banco de dados
show tables;

-- Descrever a tabela
describe contatos;

