# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import Counter
from operator import itemgetter

S = raw_input()
sorted_character_counts = sorted(Counter(S).items(), key = lambda x: (-x[1], x[0]))
for sorted_character_count in sorted_character_counts[:3]:
    print(sorted_character_count[0] + " " + str(sorted_character_count[1]))