/* Write your PL/SQL query statement below */
SELECT e.name as "Employee" FROM employee e
INNER JOIN employee mg
ON e.managerid = mg.id
WHERE mg.salary < e.salary;