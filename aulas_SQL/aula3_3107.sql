CREATE TABLE pessoa(
	id int primary key not null,
	nome varchar (250),
	peso decimal(5, 2)
);

CREATE TABLE cachorro(
	id int primary key not null,
	nome varchar(250),
	raca varchar(100),
	id_pessoa int,
	foreign key (id_pessoa) references pessoa(id)
);

insert into pessoa values(1, 'Eliel', 80);
insert into pessoa values(2, 'Marcos', 70);
insert into pessoa values(3, 'Maria', 65);
insert into pessoa values(4, 'Luan', 67);
insert into pessoa values(5, 'João Paulo', 75);

insert into cachorro values(1, 'Mahalanobis', 'SRD', 2);
insert into cachorro values(2, 'Mayla', 'SRD', 3);
insert into cachorro values(3, 'Paçoca', 'Shitzu', 4);
insert into cachorro values(4, 'Snoo´p', 'Bull Terrier', 5);

select *from pessoa;
select *from cachorro;

SELECT c.nome, p.nome
FROM cachorro as c, pessoa as p 
WHERE p.id = id_pessoa AND p.nome = 'Luan';









CREATE TABLE editora(
	id int primary key not null,
	nome varchar(100),
	localizacao varchar(100),
	cnpj varchar(100)
);

CREATE TABLE escritor(
	id int primary key not null,
	nome varchar(100),
	cpf varchar(100),
	salario decimal (8, 2)
);

CREATE TABLE livro(
	id int primary key not null,
	nome varchar(100),
	titulo varchar(100),
	preco decimal (8,2),
	id_escritor int,
	id_editora int,
	FOREIGN key(id_escritor) references escritor(id),
	FOREIGN key(id_editora) references editora(id)
);


INSERT INTO editora (id, nome, localização, cnpj) VALUES
(1, 'Editora Alpha', 'São Paulo - SP', '12.345.678/0001-90'),
(2, 'Editora Beta', 'Rio de Janeiro - RJ', '23.456.789/0001-91'),
(3, 'Editora Gamma', 'Belo Horizonte - MG', '34.567.890/0001-92'),
(4, 'Editora Delta', 'Porto Alegre - RS', '45.678.901/0001-93'),
(5, 'Editora Epsilon', 'Curitiba - PR', '56.789.012/0001-94');
INSERT INTO editora (id, nome, localização, cnpj) VALUES
(6, 'Editora Zeta', 'Salvador - BA', '67.890.123/0001-95'),
(7, 'Editora Eta', 'Fortaleza - CE', '78.901.234/0001-96'),
(8, 'Editora Theta', 'Recife - PE', '89.012.345/0001-97'),
(9, 'Editora Iota', 'Manaus - AM', '90.123.456/0001-98'),
(10, 'Editora Kappa', 'Brasília - DF', '01.234.567/0001-99'),
(11, 'Editora Lambda', 'Belém - PA', '12.345.678/0001-00'),
(12, 'Editora Mu', 'Goiânia - GO', '23.456.789/0001-01'),
(13, 'Editora Nu', 'Campo Grande - MS', '34.567.890/0001-02'),
(14, 'Editora Xi', 'João Pessoa - PB', '45.678.901/0001-03'),
(15, 'Editora Omicron', 'São Luís - MA', '56.789.012/0001-04');
select *from editora;

INSERT INTO escritor(id, nome, cpf, salario) VALUES
(1, 'Carlos Silva', '123.456.789-00', 5000.00),
(2, 'Ana Oliveira', '234.567.890-11', 6000.00),
(3, 'João Santos', '345.678.901-22', 5500.00),
(4, 'Mariana Costa', '456.789.012-33', 6200.00),
(5, 'Pedro Almeida', '567.890.123-44', 5800.00);
INSERT INTO escritor (id, nome, cpf, salario) VALUES
(6, 'Laura Pereira', '678.901.234-55', 6300.00),
(7, 'Fernando Lima', '789.012.345-66', 6000.00),
(8, 'Patrícia Ferreira', '890.123.456-77', 5700.00),
(9, 'Roberto Martins', '901.234.567-88', 5500.00),
(10, 'Juliana Costa', '012.345.678-99', 5900.00),
(11, 'Rafael Oliveira', '123.456.789-01', 6200.00),
(12, 'Fernanda Silva', '234.567.890-12', 6100.00),
(13, 'Marcelo Santos', '345.678.901-23', 5400.00),
(14, 'Cláudia Almeida', '456.789.012-34', 5800.00),
(15, 'Bruno Rodrigues', '567.890.123-45', 6000.00);

select *from livro;


INSERT INTO livro (id, nome, titulo, preco, id_escritor, id_editora) VALUES
(1, 'O Mundo das Letras', 'Explorando Novos Horizontes', 39.90, 1, 2),
(2, 'Histórias do Passado', 'Um Mergulho na História', 49.90, 2, 1),
(3, 'Tecnologia e Futuro', 'O Amanhã é Agora', 59.90, 3, 3),
(4, 'Aventura e Mistério', 'Segredos da Floresta', 45.90, 4, 4),
(5, 'Culinária Criativa', 'Receitas para Todos os Dias', 29.90, 5, 5);
INSERT INTO livro (id, nome, titulo, preco, id_escritor, id_editora) VALUES
(6, 'O Despertar dos Gigantes', 'Entre Mitologia e Realidade', 54.90, 1, 6),
(7, 'A Última Fronteira', 'Explorações Espaciais', 48.90, 1, 7),
(8, 'O Enigma dos Ancestrais', 'Segredos do Passado', 52.90, 2, 8),
(9, 'O Olhar do Viajante', 'Crônicas de Viagem', 41.90, 2, 9),
(10, 'Mistérios do Oceano', 'Aventuras Subaquáticas', 46.90, 3, 10),
(11, 'Desafios do Futuro', 'Tecnologia e Avanços', 59.90, 3, 11),
(12, 'Segredos de uma Era', 'História e Mito', 57.90, 4, 12),
(13, 'O Guia da Aventura', 'Explorações e Descobertas', 49.90, 4, 13),
(14, 'Cozinha e Cultura', 'Receitas pelo Mundo', 38.90, 5, 14),
(15, 'A Arte do Sabor', 'Receitas Criativas', 35.90, 5, 15);

delete from livro where id BETWEEN 16 and 25;

select *from livro;
select max(salario) as maiorSalario from escritor;
select min(salario) as menorSalario from escritor;
select round(avg(salario), 2) as mediaSalario from escritor;
select sum(salario) as somaSalario from escritor;
select count(salario) as qntdDeSalario from escritor;
select DISTINCT(salario) as qntdSalarioUnico from escritor;

select salario, e.nome
from escritor e, livro l
where e.id = l.id_escritor and e.id >= 7
ORDER BY salario DESC limit 1;

select salario, count(salario)
from escritor
group by salario;

select nome, titulo, preco
from livro
order by nome;

select  es.nome, l.nome
from livro l, escritor es
where es.nome = 'Cláudia Almeida' 

--Qual é o nome da editora do livro que tem id maior que 3?
select ed.nome, l.id as idLivro, l.nome
from livro l, editora ed
where l.id > 3 and id_editora = ed.id

-- quantos livros o escritor com id 2 participo
select l.nome, e.nome, e.id
from livro l, escritor e
where id_escritor = 2 and e.id = id_escritor

-- Maior preço 
select preco as maiorPreco, nome
from livro 
where preco = (select max(preco) from livro);

--nome da editora que  publicou o livro do escritor Pedro Almeida?

SELECT e.nome, l.nome, ec.salario
FROM editora AS e, livro AS l, escritor AS ec
WHERE e.id = l.id_editora AND l.id_escritor = ec.id
AND ec.nome = 'Pedro Almeida';
