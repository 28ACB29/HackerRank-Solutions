# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import defaultdict

n, m = map(int, raw_input().split(' '))
d = defaultdict(list)
for i in range(n):
    d['A'].append(raw_input())
for i in range(m):
    d['B'].append(raw_input())
for i in d['B']:
    a = []
    if i in d['A']:
        for j in range(n):
            if i == d['A'][j]:
                a.append(j + 1)
    else:
        a.append(-1)
    print(' '.join(map(str, a)))
