/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT CAST(ROUND(AVG(1.0 * LAT_N), 4) AS DECIMAL(9, 4))
FROM
(
    SELECT o.LAT_N, rn = ROW_NUMBER() OVER (ORDER BY o.LAT_N), c.c
    FROM STATION AS o
    CROSS JOIN
    (
        SELECT c = COUNT(*)
        FROM STATION
    ) AS c
) AS x
WHERE rn IN ((c + 1)/2, (c + 2)/2);