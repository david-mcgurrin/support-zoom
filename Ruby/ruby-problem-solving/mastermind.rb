counter = 0
found = false

code = (rand(6) + 1) * 1000 + (rand(6) + 1) * 100 + (rand(6) + 1) * 10 + rand(6) + 1;

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
  
  output_string = ""
  output_string_small = ""
  
  number_array = number.to_s.split("")
  code_array = code.to_s.split("")
  
  number_array.each_with_index do |num, index|

    if num.to_i == code_array[index].to_i
      output_string += "X"
  
    else

      if code_array.include? num
        output_string_small += "x"
      end
   
    end
  end

  puts output_string + output_string_small

  counter += 1

end

puts "Congrats, you cracked the code in #{counter} guesses"