# Enter your code here. Read input from STDIN. Print output to STDOUT
def isPositive(R):
    return R > 0

def isIntegerPalindrome(R):
    S = str(R)
    return S == S[::-1]

N = int(raw_input())
numbers = map(int, raw_input().split(" "))
print(all(map(isPositive, numbers)) and any(map(isIntegerPalindrome, numbers)))