print "Please enter a year: "
year = gets.chomp

until year.to_i.to_s == year
  print "Please enter a valid year: "
  year = gets.chomp
end

year = year.to_i

if (year % 4 == 0 && !(year % 100 == 0)) ||  year % 400 == 0
  puts "#{year} is a leap year"
else 
  puts "#{year} is NOT a leap year"
end
