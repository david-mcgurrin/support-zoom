def verse(number)
  new_number = number -1

  puts "#{number} bottle#{number > 1 ? "s" : ""} of beer on the wall,"
  puts "#{number} bottle#{number > 1 ? "s" : ""} of beer."
  puts "Take one down and pass it around,"
  puts "#{number > 1 ? new_number : "no more"} bottle#{new_number> 1 ? "s" : ""} of beer on the wall."
end

def final_verse(start_num)
  puts "No more bottles of beer on the wall,"
  puts "no more bottles of beer."
  puts "Go to the store and buy some more,"
  puts "#{start_num} bottles of beer on the wall."
end


verse(1)
puts
final_verse(99)