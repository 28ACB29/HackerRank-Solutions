import numpy

[N, M] = map(int, raw_input().split(" "))
array = []
for i in range(N):
    array.append(map(int, raw_input().split(" ")))
matrix = numpy.array(array)
print(numpy.transpose(matrix))
print(matrix.flatten())