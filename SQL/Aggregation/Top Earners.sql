/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT *
FROM
(
    SELECT (months * salary) as earnings, COUNT(months * salary)
    FROM   Employee
    GROUP BY months * salary
    ORDER BY months * salary DESC
) earnings2
WHERE rownum <= 1
ORDER BY rownum;
