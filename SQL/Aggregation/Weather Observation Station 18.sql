/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT ROUND(ABS(MAX(LAT_N) - MAX(LONG_W)) + ABS(MIN(LAT_N) - MIN(LONG_W)), 4)
FROM STATION;