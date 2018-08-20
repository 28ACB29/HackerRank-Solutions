# Enter your code here. Read input from STDIN. Print output to STDOUT
import math

class vector3:
    def __init__(self, X = 0.0, Y = 0.0, Z = 0.0):
        self.X = X
        self.Y = Y
        self.Z = Z

    def __add__(self, other):
        C = vector3()
        C.X = self.X + other.X
        C.Y = self.Y + other.Y
        C.Z = self.Z + other.Z
        return C

    def __sub__(self, other):
        C = vector3()
        C.X = self.X - other.X
        C.Y = self.Y - other.Y
        C.Z = self.Z - other.Z
        return C

    def __abs__(self):
        return math.sqrt(self.X * self.X + self.Y * self.Y + self.Z * self.Z)

    def dot(A, B):
        return A.X * B.X + A.Y * B.Y + A.Z * B.Z

    def cross(A, B):
        C = vector3()
        C.X = A.Y * B.Z - B.Y * A.Z
        C.Y = A.X * B.Z - B.X * A.Z
        C.Z = A.X * B.Y - B.X * A.Y
        return C

    def __str__(self):
        return ("%0.2f" % self.X) + ", " + ("%0.2f" % self.Y) +  ", " + ("%0.2f" % self.Z)

lineA = map(float, raw_input().split(" "))
lineB = map(float, raw_input().split(" "))
lineC = map(float, raw_input().split(" "))
lineD = map(float, raw_input().split(" "))
A = vector3(lineA[0], lineA[1], lineA[2])
B = vector3(lineB[0], lineB[1], lineB[2])
C = vector3(lineC[0], lineC[1], lineC[2])
D = vector3(lineD[0], lineD[1], lineD[2])
AB = B - A
BC = C - B
CD = D - C
X = vector3.cross(AB, BC)
Y = vector3.cross(BC, CD)
phi = math.acos(vector3.dot(X, Y) / (abs(X) * abs(Y)))
print("%0.2f" % math.degrees(phi))