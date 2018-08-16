# Enter your code here. Read input from STDIN. Print output to STDOUT
def process_text(strings)
    strings.map {|s| s.strip}.join(" ")
end