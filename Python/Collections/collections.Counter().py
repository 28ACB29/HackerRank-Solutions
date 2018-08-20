# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import Counter

X = int(raw_input())
shoe_sizes = map(int, raw_input().split(" "))
shoe_size_counts = Counter(shoe_sizes)
N = int(raw_input())
money_earned = 0
for i in range(N):
    shoe_size, shoe_price = map(int, raw_input().split(" "))
    if shoe_size_counts[shoe_size] > 1:
        money_earned += shoe_price
        shoe_size_counts[shoe_size] -= 1
    elif shoe_size_counts[shoe_size] == 1:
        money_earned += shoe_price
        del shoe_size_counts[shoe_size]
    else:
        pass
print(money_earned)
                
            