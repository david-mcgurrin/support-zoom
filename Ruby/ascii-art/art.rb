print "How big is your triangle? "
input = gets.chomp

until input.to_i.to_s == input
  print "Try again: "
  input = gets.chomp
end

input = input.to_i

1.upto(input) do |i|
  print " " * (input - i)
  puts "* " * i
end

(input - 1).downto(1) do |i|
  print " " * (input - i)
  puts "* " * i
end
