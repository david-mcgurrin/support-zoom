print "How big is your triangle? "
input = gets.chomp

until input.to_i.to_s == input
  print "Try again: "
  input = gets.chomp
end

input = input.to_i

for i in 1..input
  puts "*" * i
end
