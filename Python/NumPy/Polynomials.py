import numpy

P = map(float, raw_input().split(" "))
x = int(raw_input())
print(numpy.polyval(P, x))