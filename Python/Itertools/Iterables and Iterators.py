# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import ifilter
from itertools import combinations

N = int(raw_input())
S = raw_input().split(" ")
K = int(raw_input())
string_combinations = sorted(list(combinations(S, K)))
print(float(len(list(ifilter(lambda element: "a" in element,string_combinations)))) / float(len(string_combinations)))