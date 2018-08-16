def sum_terms(n)
  # your code here
    return (1..n).reduce(0){|sum, t| sum + (t * t + 1)}
end

