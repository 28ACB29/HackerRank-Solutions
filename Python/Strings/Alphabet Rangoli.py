# Enter your code here. Read input from STDIN. Print output to STDOUT
import string

alphabet = string.ascii_lowercase
N = int(raw_input())
for i in xrange(1,2 * N):
    dashes = "--" * abs(N - i)
    letters = "".join(map(lambda c: c + "-", alphabet[N - 1: abs(N - i): -1]))
    print dashes + letters + alphabet[abs(N - i)] + letters[::-1] + dashes