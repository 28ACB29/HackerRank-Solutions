#!/bin/python

import sys


N = int(raw_input().strip())
if N % 2 == 0 and N not in range(6, 21):
    print("Not Weird")
else:
    print("Weird")
