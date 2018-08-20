import numpy

numpy.set_printoptions(sign=' ')
[N, M] = map(int, raw_input().split(" "))
array = []
for i in range(N):
    array.append(map(int, raw_input().split(" ")))
matrix = numpy.array(array)
print(numpy.mean(matrix, axis = 1))
print(numpy.var(matrix, axis = 0))
print(numpy.std(matrix, axis = None))