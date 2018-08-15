/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT
CASE
    WHEN A + B > C AND C + A > B AND B + C > A THEN
        CASE
            WHEN A = B AND C = A AND B = C THEN 'Equilateral'
            WHEN A = B OR C = A OR B = C THEN 'Isosceles'
            ELSE 'Scalene'
        END
    ELSE 'Not A Triangle'
END
FROM TRIANGLES;