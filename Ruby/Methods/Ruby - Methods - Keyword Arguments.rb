# Your code here
def convert_temp(temp, **options)
    new_temp = 0.0
    if options.has_key?(:output_scale)
        if options[:input_scale] == options[:output_scale]
            new_temp = temp
        elsif options[:input_scale] == 'celsius'
            if options[:output_scale] == 'fahrenheit'
                new_temp = temp * 1.8 + 32
            elsif options[:output_scale] == 'kelvin'
                new_temp = temp + 273.15
            end
        elsif options[:input_scale] == 'fahrenheit'
            if options[:output_scale] == 'celsius'
                new_temp = (temp - 32) / 1.8
            elsif options[:output_scale] == 'kelvin'
                new_temp = (temp - 32) / 1.8 + 273.15
            end
        elsif options[:input_scale] == 'kelvin'
            if options[:output_scale] == 'celsius'
                new_temp = temp - 273.15
            elsif options[:output_scale] == 'fahrenheit'
                new_temp = (temp - 273.15) * 1.8 + 32
            end
        end
    else
        if options[:input_scale] == 'fahrenheit'
            new_temp = (temp - 32) / 1.8
        elsif options[:input_scale] == 'kelvin'
            new_temp = temp - 273.15
        end
    end
    return new_temp
end