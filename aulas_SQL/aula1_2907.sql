CREATE table cachorro(
	id int,
	nome varchar(100),
	raca varchar(100),
	peso decimal(5,2)
);

insert into cachorro values(1, 'Rex', 'SRD', 6.7);
insert into cachorro values(2, 'Kruskal', 'Pastor alemão', 10);
insert into cachorro values(3, 'Lindolfo', 'Dálmata', 5);
insert into cachorro values(4, 'Rajado', 'Pitbull', 7);
insert into cachorro values(5, 'Pitoco', 'Pinscher', 4.1);

--Apresenta todas as informações da tabela cachorro
select * from cachorro

 --Apreesenta todas aas informações do 'Kruskal'
select * from cachorro where nome = 'Kruskal';

--Apresenta os cachorros com id a partir de 3
select * from cachorro where id >= 3;

--Apresenta os nomes e raças dos chachorros com id menor que 3
select nome, raca from cachorro where id >= 3; 

UPDATE cachorro set nome = 'Dikjstra' where id = 2;

UPDATE cachorro set raca = 'Pitbull' where peso > 5;

DELETE from cachorro where id = 1;

DELETE from cachorro where raca = 'Pitbull';

DELETE from cachorro 

