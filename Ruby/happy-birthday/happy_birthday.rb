print "Please enter your name: "

name = gets.chomp.capitalize
birthday_greeting = "Happy Birthday"

count = 0

until count == 4

  case count
  when 2
    puts "#{birthday_greeting} dear #{name}"
  else
    puts "#{birthday_greeting} to you"
  end
  
  count+=1
end