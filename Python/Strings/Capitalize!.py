# Enter your code here. Read input from STDIN. Print output to STDOUT
def capitalize(old_string):
    return old_string[0].upper() + old_string[1:] if len(old_string) > 0 else old_string

S = raw_input().strip()
words = S.split(" ")
print(" ".join(map(capitalize, words)))
