# Enter your code here. Read input from STDIN. Print output to STDOUT
oldString = raw_input()
newCharacter = " "
newString = ""
for oldCharacter in oldString:
    if oldCharacter.isupper():
        newCharacter = oldCharacter.lower()
    elif oldCharacter.islower():
        newCharacter = oldCharacter.upper()
    else:
        newCharacter = oldCharacter
    newString += newCharacter
print(newString)