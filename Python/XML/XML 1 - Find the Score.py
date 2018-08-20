# Enter your code here. Read input from STDIN. Print output to STDOUT
import xml.etree.ElementTree as etree

def count_attributes(root, accumulator = 0):
    current_accumulator = accumulator
    current_accumulator += len(root.attrib)
    for child in root:
        current_accumulator += count_attributes(child, accumulator)
    return current_accumulator

n = int(raw_input())
document = ""
attribute_count = 0
for i in  range(n):
    document += raw_input() + "\n"
tree = etree.ElementTree(etree.fromstring(document))
root = tree.getroot()
attribute_count = count_attributes(root)
print(attribute_count)