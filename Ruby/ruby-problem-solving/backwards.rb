name_length = 0

while name_length < 2 do

  print "Enter your full name: "
  user_name_array = gets.chomp.split(" ")
  name_length = user_name_array.length
end

puts "Hello #{user_name_array.last.capitalize} #{user_name_array.first.capitalize}"