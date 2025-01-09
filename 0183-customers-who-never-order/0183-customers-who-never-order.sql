SELECT c.name AS Customers
FROM customers c
left JOIN orders o ON c.id = o.customerId
WHERE c.id NOT IN (SELECT customerId FROM orders);

