/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT A.N,
    CASE
        WHEN A.P IS NULL THEN 'Root'
        WHEN EXISTS (SELECT B.N FROM BST B WHERE A.N = B.P) THEN 'Inner'
        ELSE 'Leaf'
    END
FROM BST A
ORDER BY A.N;