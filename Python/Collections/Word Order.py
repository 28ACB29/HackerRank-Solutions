# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import Counter

n = int(raw_input())
words = []
occurences = []
for i in range(n):
    words.append(raw_input())
word_counts = Counter(words)
print(len(word_counts))
for word in words:
    if word_counts[word] != 0:
        occurences.append(word_counts[word])
        word_counts.pop(word)
print(' '.join(map(str, occurences)))