# Your code here
require 'complex'
include Math
def prime?(n)
    (2..Integer(Math::sqrt(n))).each do |number|
        if n % number == 0
            return false
        end
    end
    if n == 1
        return false
    else
        return true
    end
end