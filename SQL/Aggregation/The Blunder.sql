/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT CEIL(AVG(Salary) - AVG(CAST(REPLACE(CAST(Salary AS VARCHAR(5)), '0', '') AS INT)))
FROM Employees;