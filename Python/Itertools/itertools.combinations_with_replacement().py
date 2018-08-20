# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import combinations_with_replacement

inputs = raw_input().split(" ")
S = sorted(inputs[0])
k = int(inputs[1])
string_combinations_with_replacement = combinations_with_replacement(S, k)
for string_combination_with_replacement in string_combinations_with_replacement:
    print("".join(string_combination_with_replacement))