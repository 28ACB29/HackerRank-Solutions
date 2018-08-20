# Enter your code here. Read input from STDIN. Print output to STDOUT
import xml.etree.ElementTree as etree

def tree_depth(root, depth = 0):
    current_depth = depth
    maximum_child_depth = 0
    if len(root) != 0:
        current_depth += 1
        for child in root:
            maximum_child_depth = max(tree_depth(child, depth), maximum_child_depth)
        current_depth += maximum_child_depth
    return current_depth

n = int(raw_input())
document = ""
depth = 0
for i in  range(n):
    document += raw_input() + "\n"
tree = etree.ElementTree(etree.fromstring(document))
root = tree.getroot()
depth = tree_depth(root)
print(depth)