# Enter your code here. Read input from STDIN. Print output to STDOUT
plantCount = int(raw_input())
plantHeights = map(int, raw_input().split(" "))
distinctPlantHeights = set(plantHeights)
print(float(sum(distinctPlantHeights)) / float(len(distinctPlantHeights)))