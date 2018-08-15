/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT (CASE WHEN Grades.Grade >= 8 THEN Students.name ELSE 'NULL' END) AS Name, Grades.Grade, Students.Marks
FROM Students, Grades
WHERE Students.Marks BETWEEN Grades.Min_Mark AND Grades.Max_Mark
ORDER BY Grades.Grade DESC, Students.name ASC, Students.Marks ASC;