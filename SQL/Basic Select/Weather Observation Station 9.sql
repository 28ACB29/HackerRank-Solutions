/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT DISTINCT CITY
FROM STATION
WHERE SUBSTR(CITY, 1, 1) != 'A' AND SUBSTR(CITY, 1, 1) != 'E' AND SUBSTR(CITY, 1, 1) != 'I' AND SUBSTR(CITY, 1, 1) != 'O' AND SUBSTR(CITY, 1, 1) != 'U'
ORDER BY CITY ASC;