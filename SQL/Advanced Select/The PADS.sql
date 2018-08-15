/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT Name ||'(' || SUBSTR(Occupation, 0, 1) ||')'
FROM Occupations
ORDER BY Name;
SELECT 'There are total ' || COUNT(Occupation) || ' ' || LOWER(Occupation) || 's.'
FROM Occupations
GROUP BY Occupation
ORDER BY COUNT(Occupation) ASC, Occupation ASC;