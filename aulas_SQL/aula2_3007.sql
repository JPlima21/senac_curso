CREATE TABLE carros(
	id int PRIMARY KEY NOT NULL,
	nome varchar(100),
	frabricante varchar(100),
	cor varchar(100),
	motor varchar(100),
	aro int,
	preco decimal(8,2),
	ano_lancamento int
);

drop table carros;

insert into carros values(1, 'Uno', 'Fiat', 'Preto', '1.0', 13, 9500, 1996);
insert into carros values(2, 'Gol GTI', 'Volkswagen', 'Azul_Escuro', '2.0 injetado', 15, 16000, 1989);
insert into carros values(3, 'Civic G10', 'Honda', 'Branco', '1.5 turbo ou 2.0 aspirado', 18, 98000, 2017);
insert into carros values(4, 'Lançer evo', 'Mitsubishi', 'Cinza', '2.0', 18, 182643, 2012);

insert into carros values
(5, 'Corolla Altis', 'Toyota', 'Prata', '2.0', 22, 123456, 2019),
(6, 'A4', 'Audi', 'Branco', '2.0 Turbo', 19, 198765, 2021),
(7, 'Civic EX', 'Honda', 'Azul', '1.5 Turbo', 23, 178934, 2017),
(8, '328i', 'BMW', 'Preto', '2.0 Turbo', 17, 256789, 2016),
(9, 'Charger R/T', 'Dodge', 'Vermelho', '5.7 V8', 14, 345678, 2020),
(10, 'Clio RS', 'Renault', 'Amarelo', '2.0', 21, 234567, 2018),
(11, 'S3', 'Audi', 'Cinza', '2.0 Turbo', 22, 198765, 2019),
(12, 'Stinger', 'Kia', 'Prata', '3.3 V6', 20, 234567, 2020),
(13, 'Camaro SS', 'Chevrolet', 'Laranja', '6.2 V8', 16, 345678, 2019),
(14, 'Q50', 'Infiniti', 'Azul Escuro', '3.0 Turbo', 18, 234567, 2017),
(15, 'Boxster', 'Porsche', 'Vermelho', '2.7', 24, 456789, 2021);

select * from carros;

select nome, motor, preco from carros;

select * from carros where ano_lancamento > 2000;