# Enter your code here. Read input from STDIN. Print output to STDOUT
n = input()
A = set(map(int, raw_input().split())) 
N = int(raw_input())
for i in range(N):
    instruction = raw_input().split(" ")
    numbers = set(map(int, raw_input().split(" ")))
    if instruction[0] == "difference_update":
        A -= numbers
    elif instruction[0] == "intersection_update":
        A &= numbers
    elif instruction[0] == "symmetric_difference_update":
        A ^= numbers
    elif instruction[0] == "update":
        A |= numbers
    else:
        print("Incorrect instruction")
print(sum(A))