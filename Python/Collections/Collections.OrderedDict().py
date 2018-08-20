# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import OrderedDict

N = int(raw_input())
price_list = OrderedDict()
words = list()
item_name = ""
net_price = 0
for i in range(0,N):
    words = raw_input().split(" ")
    item_name = " ".join(words[:-1])
    net_price = int(words[-1])
    if item_name in price_list:
        price_list[item_name] += net_price
    else:
        price_list[item_name] = net_price
for item_name, net_price in price_list.items():
    print(item_name + " " + str(net_price))
