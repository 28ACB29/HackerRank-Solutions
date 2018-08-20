# Enter your code here. Read input from STDIN. Print output to STDOUT
fullString = raw_input()
subString = raw_input()
count = 0
for i in range(len(fullString) - len(subString) + 1):
    if fullString[i:(i + len(subString))] == subString:
        count += 1
print(count)