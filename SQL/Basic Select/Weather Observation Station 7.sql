/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT DISTINCT CITY
FROM STATION
WHERE SUBSTR(CITY,LENGTH(CITY),1) = 'a' OR SUBSTR(CITY,LENGTH(CITY),1) = 'e' OR SUBSTR(CITY,LENGTH(CITY),1) = 'i' OR SUBSTR(CITY,LENGTH(CITY),1) = 'o' OR SUBSTR(CITY,LENGTH(CITY),1) = 'u'
ORDER BY CITY ASC;
