# Enter your code here. Read input from STDIN. Print output to STDOUT
vowels = 'AEIOU'
S = raw_input()
kevin = 0
stuart = 0
length = len(S)
for i in range(length):
    if S[i] in vowels:
        kevin += length - i
    else:
        stuart += length - i
if kevin > stuart:
    print("Kevin " + str(kevin))
elif kevin < stuart:
    print("Stuart " + str(stuart))
elif kevin == stuart:
    print("Draw ")
else:
    print("Check code")