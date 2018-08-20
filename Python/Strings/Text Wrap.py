# Enter your code here. Read input from STDIN. Print output to STDOUT
S = raw_input()
w = int(raw_input())
chunks = (len(S) / w) + (0 if len(S) % w == 0 else 1)
for i in range(chunks):
    print(S[(w * i):min((w * (i + 1)), len(S))])