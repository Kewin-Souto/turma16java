create database db_cidade_das_carnes;

create table tb_produto(
id bigint auto_increment,
nome varchar (40),
valor bigint,
tipo varchar (40),
distribuidor varchar (40),
idealpara varchar (40),
primary key (id)
);

insert tb_produto values
(default,'picanha','100','De primeira','Cotabest', 'churrasco/forno' ),
(default,'Sobrecoxafrango','22','Aviário','Bomfrango', 'Diversos' ),
(default,'paleta', '27','De terceira','Bigboi', 'cozidos' ),
(default,'acém','29','De segunda','Tiaocarnes', 'cozidos' ),
(default,'fraldinha','30','De segunda','Tiaocarnes', 'cozida/forno' ),
(default,'bisteca','32','Suinos','Jaoleiton', 'Frigideira' ),
(default,'alcatra','42','De primeira','Cotabest', 'churrasco/forno' ),
(default,'Pão de alho','35','tiragosto','Panificadoralfa', 'churrasco/forno' );




create table tb_categoria(
id bigint auto_increment not null,
Nome varchar (40)not null,
ave enum ('s,n')not null,
suino enum ('s,n')not null,
bovino enum ('s,n')not null,
id_cat bigint not null,
primary key (id),
foreign key (id_cat) references tb_categoria(id)
);
 
 
 insert tb_categoria values
(default,'Assinha','s','n','n',2),
(default,'Lombo','n','s','n',5),
(default,'Bacon','n','s','n',6),
(default,'Patinho','n','n','s',7),
(default,'maminha','n','n','s',1);


 
 select valor from tb_produto where valor > 50;
  select nome,valor from tb_produto where valor between 3 and 60;
  select  nome,valor from tb_produto where nome like "%c%";
   select * from tb_categoria inner join tb_produto on 
   tb_categoria.id_cat=tb_produto.id;
    select * from tb_categoria inner join tb_produto on 
   tb_categoria.id_cat=tb_produto.id where tb_produto.tipo="maminha";
