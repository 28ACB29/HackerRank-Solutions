n = input()
s = set(map(int, raw_input().split())) 
N = int(raw_input())
for i in range(N):
    line = raw_input().split()
    if line[0] == "discard":
        s.discard(int(line[1]))
    elif line[0] == "pop":
        s.pop()
    elif line[0] == "remove":
        s.remove(int(line[1]))
    else:
        print("Incorrect instruction")
print(sum(s))