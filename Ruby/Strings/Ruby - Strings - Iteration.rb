# Your code here
def count_multibyte_char(s)
    multibytes = 0
    s.each_char {|c| multibytes += 1 if c.bytesize > 1}
    return multibytes
end