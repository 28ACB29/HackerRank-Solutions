/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT DISTINCT CITY
FROM STATION
WHERE (SUBSTR(CITY, 1, 1) != 'A' AND SUBSTR(CITY, 1, 1) != 'E' AND SUBSTR(CITY, 1, 1) != 'I' AND SUBSTR(CITY, 1, 1) != 'O' AND SUBSTR(CITY, 1, 1) != 'U') OR (SUBSTR(CITY,LENGTH(CITY),1) != 'a' AND SUBSTR(CITY,LENGTH(CITY),1) != 'e' AND SUBSTR(CITY,LENGTH(CITY),1) != 'i' AND SUBSTR(CITY,LENGTH(CITY),1) != 'o' AND SUBSTR(CITY,LENGTH(CITY),1) != 'u')
ORDER BY CITY ASC;