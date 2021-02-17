select descrição, preço from tb_categoria where preço > 45 ;
select descrição, preço from tb_categoria where preço between 29 and 60;
select descrição from tb_categoria where descrição like "%C%";
select * from tb_categoria inner join tb_pizza on tb_categoria.id = tb_pizza.id;
select tb_categoria.descrição, tb_pizza.nome from tb_categoria inner join tb_pizza on tb_categoria.id = tb_pizza.pizza_id
where tb_pizza.pizza_id = 1;