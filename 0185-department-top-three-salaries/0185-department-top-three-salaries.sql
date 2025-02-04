
WITH RankedSalaries AS(
    SELECT d.name AS Department, e.name AS Employee, salary AS Salary,
    DENSE_RANK() OVER(PARTITION BY departmentId ORDER BY salary DESC) AS Raank
    FROM Employee e
    INNER JOIN Department d
    ON e.departmentId = d.id
)
SELECT Department, Employee, Salary
FROM RankedSalaries
WHERE Raank <= 3;