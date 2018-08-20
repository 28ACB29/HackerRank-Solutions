import numpy

N =int(raw_input())
array =[]
for i in range(N):
    array.append(map(float, raw_input().split(" ")))
A = numpy.array(array)
print(numpy.linalg.det(A))