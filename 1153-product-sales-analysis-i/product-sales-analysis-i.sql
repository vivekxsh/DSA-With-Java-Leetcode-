# Write your MySQL query statement below

select pro.product_name, sa.year, sa.price 
from Sales sa
inner join Product pro 
on pro.product_id = sa.product_id;