# Enter your code here. Read input from STDIN. Print output to STDOUT
[N, M] = map(int, raw_input().split(" "))
table = []
for i in range(N):
    table.append(map(int, raw_input().split(" ")))
k = int(raw_input())
newTable = sorted(table, key = lambda x : x[k])
for row in newTable:
    print(" ".join(map(str, row)))