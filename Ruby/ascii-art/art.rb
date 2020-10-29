print "How big is your triangle? "
input = gets.chomp

until input.to_i.to_s == input
  print "Try again: "
  input = gets.chomp
end

input = input.to_i

input.downto(1) do |i|
  num_spaces = i - 1
  num_asterisks = input - i + 1

  puts " " * num_spaces + "*" * num_asterisks
end
