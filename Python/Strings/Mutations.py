# Enter your code here. Read input from STDIN. Print output to STDOUT
S = raw_input()
arguments = raw_input().split(' ')
i = int(arguments[0])
c = arguments[1].strip()
mutant = S[:i] + c + S[i + 1:]
print(mutant)