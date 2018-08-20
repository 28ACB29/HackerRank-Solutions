import numpy

numpy.set_printoptions(sign=' ')
A = numpy.array(map(float, raw_input().split(" ")))
print(numpy.floor(A))
print(numpy.ceil(A))
print(numpy.rint(A))