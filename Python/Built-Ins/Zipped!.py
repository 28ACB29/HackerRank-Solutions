# Enter your code here. Read input from STDIN. Print output to STDOUT
[N, X] = map(int, raw_input().split())
scores = []
for subject in range(X):
    scores += [map(float, raw_input().split())]
transposed_scores = zip(*scores)
for student in transposed_scores:
    print(sum(student) / len(student))