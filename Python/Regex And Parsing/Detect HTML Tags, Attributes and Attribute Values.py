# Enter your code here. Read input from STDIN. Print output to STDOUT
from HTMLParser import HTMLParser

class MyHTMLParser(HTMLParser):
    def handle_starttag(self, tag, attributes):
        print(tag)
        for attribute in attributes:
            print("-> " + str(attribute[0]) + " > " + str(attribute[1]))

    def handle_startendtag(self, tag, attributes):
        print(tag)
        for attribute in attributes:
            print("-> " + str(attribute[0]) + " > " + str(attribute[1]))

n = int(raw_input())
document = ""
for i in  range(n):
    document += raw_input() + "\n"
parser = MyHTMLParser()
parser.feed(document)