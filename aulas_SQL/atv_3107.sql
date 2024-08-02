CREATE TABLE pessoa(
	id int PRIMARY key not null,
	nome varchar(100),
	idade int,
	cpf varchar(100),
	id_carro int,
	id_gato int
);

CREATE TABLE gato(
	id int primary key not null,
	nome varchar(100),
	idade int,
	cor_pelagem varchar(100)
);

CREATE TABLE carro(
	id int primary key not null,
	nome varchar(100),
	fabricante varchar(100),
	cor varchar(100),
	num_placa varchar(20)
);

INSERT INTO gato (id, nome, idade, cor_pelagem) VALUES
(1, 'Whiskers', 2, 'Cinza'),
(2, 'Mittens', 3, 'Preto'),
(3, 'Oliver', 1, 'Branco'),
(4, 'Luna', 4, 'Laranja'),
(5, 'Simba', 5, 'Amarelo'),
(6, 'Milo', 2, 'Tigrado');
INSERT INTO gato (id, nome, idade, cor_pelagem) VALUES
(7, 'Bella', 3, 'Cinza claro'),
(8, 'Ginger', 4, 'Laranja claro'),
(9, 'Shadow', 2, 'Preto com manchas brancas'),
(10, 'Nina', 5, 'Branco com manchas cinza');

INSERT INTO carro (id, nome, fabricante, cor, num_placa) VALUES
(1, 'Fusca', 'Volkswagen', 'Azul', 'ABC-1234'),
(2, 'Civic', 'Honda', 'Preto', 'XYZ-5678'),
(3, 'Corolla', 'Toyota', 'Prata', 'LMN-9012'),
(4, 'Celta', 'Chevrolet', 'Vermelho', 'OPQ-3456'),
(5, 'Gol', 'Volkswagen', 'Branco', 'RST-7890'),
(6, 'Focus', 'Ford', 'Cinza', 'UVW-2345');
INSERT INTO carro (id, nome, fabricante, cor, num_placa) VALUES
(7, 'Palio', 'Fiat', 'Verde', 'XYZ-3456'),
(8, 'Onix', 'Chevrolet', 'Azul escuro', 'ABC-6789'),
(9, 'Cruze', 'Chevrolet', 'Marrom', 'LMN-3456'),
(10, 'Jetta', 'Volkswagen', 'Bege', 'OPQ-7890');

INSERT INTO pessoa (id, nome, idade, cpf, id_carro, id_gato) VALUES
(1, 'Ana Silva', 29, '123.456.789-01', 1, 1),
(2, 'João Santos', 34, '987.654.321-02', 2, 2),
(3, 'Maria Oliveira', 42, '111.222.333-44', 3, 3),
(4, 'Carlos Pereira', 25, '555.666.777-88', 4, 4),
(5, 'Juliana Costa', 37, '999.888.777-66', 5, 5),
(6, 'Pedro Almeida', 31, '222.333.444-55', 6, 6);
INSERT INTO pessoa (id, nome, idade, cpf, id_carro, id_gato) VALUES
(7, 'Fernanda Lima', 28, '333.444.555-66', 7, 7),
(8, 'Roberto Costa', 45, '444.555.666-77', 8, 8),
(9, 'Tatiane Rocha', 33, '555.666.777-88', 9, 9),
(10, 'Eduardo Martins', 39, '666.777.888-99', 10, 10); 

delete TABLE pessoa;
delete table gato;
delete table carro;

select * from pessoa; 

select nome from gato as gt, pessoa as ps



