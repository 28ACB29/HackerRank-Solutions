# Enter your code here. Read input from STDIN. Print output to STDOUT
N = int(raw_input())
command = ''
name = ''
array = []
for i in range(N):
    command = raw_input().split(' ')
    name = command[0].rstrip()
    if name == 'append':
        array.append(int(command[1]))
    elif name == 'insert':
        array.insert(int(command[1]), int(command[2]))
    elif name == 'remove':
        array.remove(int(command[1]))
    elif name == 'pop':
        array.pop()
    elif name == 'index':
        array.index(int(command[1]))
    elif name == 'count':
        array.count(int(command[1]))
    elif name == 'sort':
        array.sort()
    elif name == 'reverse':
        array.reverse()
    elif name == 'print':
        print(array)
    else:
        pass
    