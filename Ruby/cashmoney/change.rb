print "Enter your change: "
change = gets.chomp.to_f

change_count = 0

new_change = change

toonie_count = 0
loonie_count = 0
quarter_count = 0
dime_count = 0
nickel_count = 0

while new_change > 0.05

  if new_change >= 2
    new_change = (new_change % 2).round(2)
    toonie_count += 1

  elsif new_change >= 1
    new_change = (new_change % 1).round(2)
    loonie_count += 1

  elsif new_change >= 0.25
    new_change = (new_change % 0.25).round(2)
    quarter_count += 1

  elsif new_change >= 0.10

    new_change = (new_change % 0.10).round(2)
    dime_count += 1

  elsif new_change >= 0.05
    new_change = (new_change % 0.05).round(2)
    nickel_count += 1
  end

  puts new_change

  change_count += 1


end

puts "Number of coins #{change_count}"
puts "Toonie: #{toonie_count}"
puts "Loonie: #{loonie_count}"
puts "Quarter: #{quarter_count}"
puts "Dime: #{dime_count}"
puts "Nickel: #{nickel_count}"