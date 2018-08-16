
def identify_class(obj)
    # write your case control structure here
    output = case obj
       when Hacker then "a Hacker!"
       when Submission then "a Submission!"
       when TestCase then "a TestCase!"
       when Contest then "a Contest!"
       else "an unknown model"
    end

puts "It's " + output

end
