# Enter your code here. Read input from STDIN. Print output to STDOUT
N = int(raw_input())
student = []
grade_average = 0.0
students = {}
for i in range(N):
    student = raw_input().split(' ')
    grade_average = reduce(lambda x, y: float(x) + float(y), student[1:])
    grade_average /= float(len(student[1:]))
    students[student[0]] = grade_average
print("{0:.2f}".format(students[raw_input()]))