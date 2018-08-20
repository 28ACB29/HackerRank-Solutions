# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import combinations

inputs = raw_input().split(" ")
S = sorted(inputs[0])
k = int(inputs[1])
for i in range(1, k + 1):
    string_combinations = combinations(S, i)
    for string_combination in string_combinations:
        print("".join(string_combination))