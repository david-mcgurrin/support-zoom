def crack_code(number, code)

  number_array = number.to_s.split("")
  code_array = code.to_s.split("")
  correct_place_array = []
  incorrect_place_array = []
  refined_incorrect_place_array = []

  number_array.each_with_index do |num, index|

    if num.to_i == code_array[index].to_i
      correct_place_array << num
    else
      incorrect_place_array << num if code_array.include? num
    end

  end

  code_array.each_with_index do |n, i|

    unless n == number_array[i]
      refined_incorrect_place_array << n if incorrect_place_array.include? n
    end
    
  end

  [correct_place_array.length, refined_incorrect_place_array.length]

end

code = (rand(6) + 1) * 1000 + (rand(6) + 1) * 100 + (rand(6) + 1) * 10 + rand(6) + 1;

# For testing
# code = 1234

# code = 1224

# code = 1222

guess_counter = 0
code_cracked = false

until code_cracked

  print "Enter your guess: "
  input = gets.chomp

  until input.to_i.to_s == input
    print "Must be an integer: "
    input = gets.chomp
  end

  input = input.to_i

  until input.to_i >= 1111 && input.to_i <= 6666
    print "Must be in range 1111 to 6666: "
    input = gets.chomp
  end

  input = input.to_i

  if input == code
    code_cracked = true
  end
    
  code_hints = crack_code(input, code)

  puts ("X" * code_hints.first) + ("x" * code_hints.last) unless code_cracked

  guess_counter += 1

end

puts "Congrats, you cracked the code #{code} in #{guess_counter} guesses"
