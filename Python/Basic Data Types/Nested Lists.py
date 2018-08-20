# Enter your code here. Read input from STDIN. Print output to STDOUT
import operator
import sets

n = int(raw_input())
name = ''
mark = 0.0
classroom = []
markSet = set()
nextMaximumMark = 0.0
for i in range(n):
    name = raw_input()
    mark = float(raw_input())
    classroom.append([name,mark])
    markSet.add(mark)
classroom = sorted(classroom, key = operator.itemgetter(0))
nextMaximumMark = sorted(markSet)[1]
for (name, mark) in classroom:
    if mark == nextMaximumMark:
        print(name)