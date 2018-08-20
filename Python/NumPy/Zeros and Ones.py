import numpy

dimensions = map(int, raw_input().split(" "))
print(numpy.zeros(dimensions, dtype = numpy.int))
print(numpy.ones(dimensions, dtype = numpy.int))