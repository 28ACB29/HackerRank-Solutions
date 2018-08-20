# Enter your code here. Read input from STDIN. Print output to STDOUT
def fibonacci(n):
    numbers = []
    if n >= 1:
        numbers.append(0)
    if n >= 2:
        numbers.append(1)
    if n >= 3:
        for i in range(2, n):
            numbers.append(numbers[i - 1] + numbers[i - 2])
    return numbers

N = int(raw_input())
print(map(lambda a : a ** 3, fibonacci(N)))