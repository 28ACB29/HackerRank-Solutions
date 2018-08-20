# Enter your code here. Read input from STDIN. Print output to STDOUT
T = int(raw_input())
for i in range(T):
    try:
        [a, b] = map(int, raw_input().rstrip().split(" "))
        print a / b
    except ZeroDivisionError as zeroDivisionError:
        print "Error Code:", zeroDivisionError
    except ValueError as valueError:
        print "Error Code:", valueError
