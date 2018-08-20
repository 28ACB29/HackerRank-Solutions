# Enter your code here. Read input from STDIN. Print output to STDOUT
N = int(raw_input())
numbers = tuple(map(int, raw_input().split(' ')))
print(hash(numbers))
