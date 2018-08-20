# Enter your code here. Read input from STDIN. Print output to STDOUT
N = int(raw_input())
A = sorted(set(map(int, raw_input().split(' '))), reverse=True)
print(A[1])