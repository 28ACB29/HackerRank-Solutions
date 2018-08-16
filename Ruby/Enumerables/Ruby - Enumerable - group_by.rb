def group_by_marks(marks, n)
  # your code here
    return marks.group_by{|name, grade| grade > n ? "Passed" : "Failed"}
end
