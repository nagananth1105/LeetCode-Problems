SELECT x,y,z,
CASE WHEN  x+y > z and x+z > y and y+z > x THEN 'Yes' ELSE 'No' end
AS triangle
FROM triangle;