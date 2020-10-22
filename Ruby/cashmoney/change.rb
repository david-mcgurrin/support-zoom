print "Enter your change: "
change = gets.chomp.to_f

change_count = 0

new_change = change

toonie_count = 0
loonie_count = 0
quarter_count = 0
dime_count = 0
nickel_count = 0

#puts (new_change * 20).round / 20.0

new_change = (new_change * 20).round / 20.0

while new_change > 0

  if new_change >= 2
    toonie_count = (new_change / 2).floor
    new_change = (new_change % 2).round(2)

  elsif new_change >= 1
    loonie_count = (new_change / 1).floor
    new_change = (new_change % 1).round(2)

  elsif new_change >= 0.25
    quarter_count = (new_change / 0.25).floor
    new_change = (new_change % 0.25).round(2)

  elsif new_change >= 0.10
    dime_count = (new_change / 0.10).floor
    new_change = (new_change % 0.10).round(2)

  elsif new_change >= 0.05
    nickel_count = (new_change / 0.05).floor
    new_change = (new_change % 0.05).round(2)

  end

  #puts new_change

  change_count += 1


end

puts "Number of coins #{change_count}"
puts "Toonie: #{toonie_count}"
puts "Loonie: #{loonie_count}"
puts "Quarter: #{quarter_count}"
puts "Dime: #{dime_count}"
puts "Nickel: #{nickel_count}"