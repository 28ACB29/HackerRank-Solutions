# Enter your code here. Read input from STDIN. Print output to STDOUT
english_students = int(raw_input())
english_subscriptions = map(int, raw_input().split(" "))
french_students = int(raw_input())
french_subscriptions = map(int, raw_input().split(" "))
roll_call = set(english_subscriptions).difference(set(french_subscriptions))
print(len(roll_call))