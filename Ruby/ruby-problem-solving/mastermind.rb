code = (rand(6) + 1) * 1000 + (rand(6) + 1) * 100 + (rand(6) + 1) * 10 + rand(6) + 1;

# code = 1234

# puts code

counter = 0
found = false

until found

  begin
    print "Enter a number: "
    number = Integer(gets)
  rescue
    retry
  end

  if number == code
    found = true
  end
    
  number_array = number.to_s.split("")
  code_array = code.to_s.split("")

  correct_place_array = []
  incorrect_place_array = []

  output_string = ""
  output_string_small = ""
  
  number_array.each_with_index do |num, index|

    if num.to_i == code_array[index].to_i
      correct_place_array.push(num)
    else
      if code_array.include? num
        incorrect_place_array.push(num)
      end
    end

  end

  code_array.each do |num|

    if correct_place_array.include? num
      output_string += "X"
    
    elsif incorrect_place_array.include? num
      output_string_small += "x"
    end

  end

  unless found
    puts output_string + output_string_small
  end

  counter += 1

end

puts "Congrats, you cracked the code in #{counter} guesses"