# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import deque

T = int(raw_input())
n = 0
side_lengths = deque()
for i in range(T):
    possible = True
    n = int(raw_input())
    side_lengths.extend(map(int, raw_input().strip().split(" ")))
    top = max(side_lengths[0], side_lengths[-1])
    while len(side_lengths) > 0 and possible:
        if side_lengths[0] > side_lengths[-1] and top >= side_lengths[0]:
            top = side_lengths.popleft()
        elif side_lengths[0] <= side_lengths[-1] and top >= side_lengths[-1]:
            top = side_lengths.pop()
        else:
            possible = False
    if possible:
        print("Yes")
    else:
        print("No")
    side_lengths.clear()