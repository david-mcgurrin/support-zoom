begin
  print "Enter a valid year: "
  year = Integer(gets)
rescue
  retry
end

if (year % 4 == 0 && !(year % 100 == 0)) ||  year % 400 == 0
  puts "#{year} is a leap year"
else 
  puts "#{year} is NOT a leap year"
end