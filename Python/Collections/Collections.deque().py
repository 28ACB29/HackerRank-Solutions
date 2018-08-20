# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import deque

N = int(raw_input())
d = deque()
command = ""
for i in range(N):
    command = raw_input().split()
    instruction = command[0]
    if instruction == "append":
        d.append(int(command[1]))
    elif instruction == "appendleft":
        d.appendleft(int(command[1]))
    elif instruction == "pop":
        d.pop()
    elif instruction == "popleft":
        d.popleft()
    else:
        print("incorrect command")
print(" ".join(map(str, d)))