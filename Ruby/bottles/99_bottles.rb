def verse(number)

  original_number = number

  while number > 0
    
    new_number = number -1

    puts "#{number} bottle#{number > 1 ? "s" : ""} of beer on the wall,"
    puts "#{number} bottle#{number > 1 ? "s" : ""} of beer."
    puts "Take one down and pass it around,"
    puts "#{number > 1 ? new_number : "no more"} bottle#{new_number> 1 ? "s" : ""} of beer on the wall."
    puts

    number -= 1

  end

  puts "No more bottles of beer on the wall,"
  puts "no more bottles of beer."
  puts "Go to the store and buy some more,"
  puts "#{original_number} bottles of beer on the wall."

end

print "How many bottles are on the wall? "
num_bottles = gets.chomp.to_i

verse(num_bottles)
