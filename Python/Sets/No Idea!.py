# Enter your code here. Read input from STDIN. Print output to STDOUT
n, m = map(int, raw_input().split())
numbers = map(int, raw_input().split())
A = set(map(int, raw_input().split()))
B = set(map(int, raw_input().split()))
count = 0
for i in numbers:
    if i in A:
        count += 1
    if i in B:
        count -= 1
print(count)