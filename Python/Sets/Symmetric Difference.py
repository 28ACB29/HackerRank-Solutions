# Enter your code here. Read input from STDIN. Print output to STDOUT
M = int(raw_input())
a = set(map(int, raw_input().split(' ')))
N = int(raw_input())
b = set(map(int, raw_input().split(' ')))
c = (a.union(b)).difference(a.intersection(b))
d = sorted(c)
for element in d:
    print(element)