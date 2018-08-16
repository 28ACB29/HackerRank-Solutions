# Enter your code here. Read input from STDIN. Print output to STDOUT
def transcode(oldString)
    newString = oldString.force_encoding(Encoding::UTF_8)
    return newString
end

