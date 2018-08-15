/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT Wands.id, Wands_Property.age, Wands.coins_needed, Wands.power
FROM Wands, Wands_Property
WHERE Wands.code = Wands_Property.code AND Wands_Property.is_evil = 0 AND Wands.coins_needed =
(
    SELECT MIN(Cheap_Wands.coins_needed)
    FROM Wands Cheap_Wands
    WHERE Wands.power = Cheap_Wands.power AND Wands.code = Cheap_Wands.code
)
ORDER BY Wands.power DESC, Wands_Property.age DESC;