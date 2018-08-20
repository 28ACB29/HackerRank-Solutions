# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import Counter 

K = int(raw_input())
rooms = raw_input().split(" ")
room_counts = Counter(rooms)
print(room_counts.most_common()[::-1][0][0])