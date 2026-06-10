# Write your MySQL query statement belo
select round(avg(case when order_date=customer_pref_delivery_date then 1 else 0 end )*100,2) as immediate_percentage from Delivery where delivery_id in
(select delivery_id from Delivery t where order_date in
(select min(order_date) from Delivery where customer_id = t.customer_id) group by customer_id);