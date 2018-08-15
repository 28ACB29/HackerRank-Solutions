/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT CAST(ROUND(POWER(POWER(MAX(LAT_N) - MIN(LAT_N), 2.0) + POWER(MAX(LONG_W) - MIN(LONG_W), 2.0), 0.5), 4) AS DECIMAL(9, 4))
FROM STATION;