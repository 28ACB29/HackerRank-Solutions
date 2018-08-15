/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT DISTINCT A.X, A.Y
FROM Functions A, Functions B
WHERE A.X = B.Y AND A.Y = B.X AND A.ROWID <> B.ROWID AND A.X <= A.Y
ORDER BY A.X ASC;