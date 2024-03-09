#2.1
select first_name, last_name
from actor;
#2.2
select actor_id, first_name, last_name
from actor
where last_name like '%li%'
order by last_name, first_name;
#2.3
select country_id, country
from country
where country in ('china','bangladesh','Afghanistan');

#2.4
select count(actor_id),last_name
from actor
group by last_name
having count(actor_id)>=2;

#2.5
select sta.staff_id, sum(p.amount) as total
from staff sta join payment p using(staff_id)
where month(payment_date)=08 and year(payment_date)=2005
group by sta.staff_id;

#2.6
select f.film_id , f.title, count(fa.actor_id) as 'numero de actores'
from film f join film_actor fa using(film_id)
group by 1;
#2.7
select count(film_id) as copias, f.title
from film f join inventory i using(film_id)
where f.title like 'Hunchback Impossible';

#2.8
select ca.category_id, ca.name, sum(p.amount) as ingresos
from category ca join film_category using(category_id) join film f using(film_id) join inventory i using(film_id) join rental r using(inventory_id) join payment p using(rental_id)
group by 1
order by 3 desc
limit 5;

#2.9
select cu.customer_id, co.country, sum(p.amount) as importe
from country co join city ci using(country_id) join address ad using(city_id) join customer cu using(address_id) join store st using(store_id) join inventory i using(store_id) join rental r using(inventory_id) join payment p using(rental_id)
where co.country like 'United States'
group by cu.customer_id;

#2.10
select f.title, lan.name
from film f join language lan using(language_id)
where f.title in 
(select fi.title
from film fi join language la using(language_id)
where (fi.title like 'k%' or fi.title like 'q%') and la.name like 'English');


