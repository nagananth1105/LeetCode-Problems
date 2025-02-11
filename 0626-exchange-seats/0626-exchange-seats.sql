# Write your MySQL query statement below
select s.id ,
IFNull(
    IF(s.id % 2 =0,
    (select student from seat where id = s.id-1),
    (select student from seat where id = s.id+1)
    ),
    s.student
)as student 
from seat s
order by s.id ;