import numpy

[N, M] = map(int, raw_input().split(" "))
array_a = []
array_b = []
for i in range(N):
    array_a.append(map(int, raw_input().split(" ")))
for i in range(N):
    array_b.append(map(int, raw_input().split(" ")))
A = numpy.array(array_a)
B = numpy.array(array_b)
print(A + B)
print(A - B)
print(A * B)
print(A / B)
print(A % B)
print(A ** B)