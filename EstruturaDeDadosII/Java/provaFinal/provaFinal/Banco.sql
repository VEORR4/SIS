DROP DATABASE projetosDB;

CREATE DATABASE projetosDB;

use projetosDB;

DROP TABLE funcionario, projeto, participacao;

CREATE TABLE funcionario (
	idFuncionario INT PRIMARY KEY AUTO_INCREMENT,
	nomeFuncionario varchar(255),
	cargo varchar(255),
     departamento varchar(255)
);

CREATE TABLE projeto(
	idProjeto INT PRIMARY KEY AUTO_INCREMENT,
	nomeProjeto varchar(255),
	descricao varchar(255),
	dataInicio DATE,
	dataFim DATE
);

CREATE TABLE participacao (
	idParticipacao INT PRIMARY KEY AUTO_INCREMENT,
	idFuncionario INT FOREIGN KEY,
	idProjeto INT FOREIGN KEY,
     horasTrabalhadas INT
);