# Write your MySQL query statement below
select distinct class from Courses c where 4<(select count(class) from Courses group by class having class=c.class);