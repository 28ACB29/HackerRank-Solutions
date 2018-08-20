import numpy

[N, M, P] = map(int, raw_input().split(" "))
array_1 = []
array_2 = []
for i in range(N):
    array_1.append(map(int, raw_input().split(" ")))
for i in range(M):
    array_2.append(map(int, raw_input().split(" ")))
matrix_1 = numpy.array(array_1)
matrix_2 = numpy.array(array_2)
print(numpy.concatenate((matrix_1, matrix_2), axis = 0))