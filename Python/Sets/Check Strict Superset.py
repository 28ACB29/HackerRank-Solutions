# Enter your code here. Read input from STDIN. Print output to STDOUT
A = set(map(int, raw_input().split(" ")))
N = int(raw_input())
current_set = set()
is_superset = True
for i in range(N):
    current_set = set(map(int, raw_input().split(" ")))
    is_superset &= (len(A.difference(current_set)) != 0) & (len(current_set.difference(A)) == 0)
print(is_superset)