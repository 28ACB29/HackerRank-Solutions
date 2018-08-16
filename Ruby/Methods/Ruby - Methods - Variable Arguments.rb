# Your code here
def full_name(first, *rest)
    full = rest.reduce(first) { |member, list| member + " " + list }
    return full
end