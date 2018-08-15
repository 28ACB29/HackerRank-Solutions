/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT h.hacker_id, h.name
FROM Hackers h, Submissions s, Challenges c, Difficulty d
WHERE h.hacker_id = s.hacker_id AND s.challenge_id = c.challenge_id AND c.difficulty_level = d.difficulty_level AND s.score = d.score
GROUP BY h.hacker_id, h.name
HAVING COUNT(*) > 1
ORDER BY COUNT(*) DESC, h.hacker_id ASC;