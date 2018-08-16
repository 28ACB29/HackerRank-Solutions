def skip_animals(animals, skip)
  # Your code here
    result = Array.new()
    animals.each_with_index do |item, index|
        if index >= skip
            result.push("#{index}:#{item}")
        end
    end
    return result
end
