# Enter your code here. Read input from STDIN. Print output to STDOUT
import math

AB = int(raw_input())
BC = int(raw_input())
MBC = int(round(math.degrees(math.acos(float(BC) / math.sqrt(AB * AB + BC * BC)))))
print(str(MBC) + "°")