# Write your MySQL query statement below
select person_name from (select person_name,turn,sum(weight) over(order by turn) as total from Queue)as p where total<=1000 order by total desc limit 1;