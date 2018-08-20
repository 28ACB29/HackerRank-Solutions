# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import permutations

inputs = raw_input().split(" ")
S = sorted(inputs[0])
k = int(inputs[1])
string_permutations = permutations(S, k)
for string_permutation in string_permutations:
    print("".join(string_permutation))