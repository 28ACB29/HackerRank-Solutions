# Enter your code here. Read input from STDIN. Print output to STDOUT
S = raw_input()
print(any(str(char).isalnum() for char in S))
print(any(str(char).isalpha() for char in S))
print(any(str(char).isdigit() for char in S))
print(any(str(char).islower() for char in S))
print(any(str(char).isupper() for char in S))