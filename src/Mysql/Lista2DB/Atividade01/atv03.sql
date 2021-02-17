create database db_farmacia_do_bem;
use db_farmacia_do_bem;
create table tb_categoria(
id bigint auto_increment,
marca varchar (30),
tarja varchar (30),
Sintetico enum ( 'S','N'),
primary key (id)
);
update tb_categoria set marca = "Histshimtsu" where id = 2;
insert tb_categoria values
(default,'Faizer','vermelha','S'),
(default,'Azhor','amarela','N'),
(default,'Prizer','preta','S'),
(default,'Xoat','azul','S');


select * from tb_categoria;

create table tb_produto(
id bigint auto_increment not null,
Nome varchar (40)not null,
valor bigint not null,
generico enum ('S','N')not null,
capsula enum ('S','N')not null,
comprimido enum ('S','N')not null,
id_cat bigint not null,
primary key (id),
foreign key (id_cat) references tb_categoria(id)
);
 
 
 insert tb_produto values
(default,'decadron','100','S','N','N',5),
(default,'tandrilax','40','N','S','N',3),
(default,'Shanax','50','S','N','S',2),
(default,'Guaco','70','S','N','N',4),
(default,'acamprosato','60','S','S','S',5),
(default,'desipramina','80','S','S','N',1),
(default,'lorazepam','90','S','N','S',3),
(default,'trazodona','50','S','N','S',5);
 select nome,valor from tb_produto where valor > 50;
  select nome,valor from tb_produto where valor between 3 and 60;
  select  nome,valor from tb_produto where nome like "%d%";
   select * from tb_produto inner join tb_categoria on 
   tb_produto.id_cat=tb_categoria.id;
    select * from tb_produto inner join tb_categoria on 
   tb_produto.id_cat=tb_categoria.id where tb_categoria.tarja="preta";
 
 

