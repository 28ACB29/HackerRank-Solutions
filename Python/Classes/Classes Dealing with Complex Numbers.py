# Enter your code here. Read input from STDIN. Print output to STDOUT
import math

class complex:
    def __init__(self, real = 0.0, imaginary = 0.0):
        self.real = real
        self.imaginary = imaginary

    def __add__(self, other):
        C = complex()
        C.real = self.real + other.real
        C.imaginary = self.imaginary + other.imaginary
        return C

    def __sub__(self, other):
        C = complex()
        C.real = self.real - other.real
        C.imaginary = self.imaginary - other.imaginary
        return C

    def __mul__(self, other):
        C = complex()
        C.real = self.real * other.real - self.imaginary * other.imaginary
        C.imaginary = self.real * other.imaginary + self.imaginary * other.real
        return C

    def __div__(self, other):
        C = complex()
        variance = other.real * other.real + other.imaginary * other.imaginary
        C.real = (self.real * other.real + self.imaginary * other.imaginary) / variance
        C.imaginary = (self.imaginary * other.real - self.real * other.imaginary) / variance
        return C

    def __abs__(self):
        return "%0.2f" % math.sqrt(self.real * self.real + self.imaginary * self.imaginary)

    def __str__(self):
        string = ''
        realString = "%0.2f" % self.real
        imaginaryString = "%0.2f" % abs(self.imaginary)
        if self.real == 0.0 and self.imaginary != 0.0:
            string = "%0.2f" % self.imaginary + 'i'
        elif self.real == 0.0 and self.imaginary == 0.0:
            string = realString
        elif self.imaginary > 0.0:
            string = realString + ' + ' + imaginaryString + 'i'
        elif self.imaginary == 0.0:
            string = realString
        elif self.imaginary < 0.0:
            string = realString + ' - ' + imaginaryString + 'i'
        return string

[A, B] = map(float, raw_input().split(' '))
[C, D] = map(float, raw_input().split(' '))
complex1 = complex(A, B)
complex2 = complex(C, D)
print(complex1 + complex2)
print(complex1 - complex2)
print(complex1 * complex2)
print(complex1 / complex2)
print(abs(complex1))
print(abs(complex2))