print "Please enter your name: "

name = gets.chomp.capitalize

count = 1

while count <= 4

  print "Happy Birthday"
  puts count == 3 ? " dear #{name}" : " to you"

  count+=1
end