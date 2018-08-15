/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT ROUND(LONG_w, 4)
FROM STATION
WHERE LAT_N =
(SELECT MIN(LAT_N)
FROM STATION
WHERE LAT_N > 38.7780);