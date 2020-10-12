print "Please enter your name: "

name = gets.chomp.capitalize

count = 1

while count <= 4

  puts count == 3 ? "Happy Birthday dear #{name}" : "Happy Birthday to you"

  count+=1
end