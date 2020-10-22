print "Enter your change: "
change = gets.chomp.to_f

change_count = 0

puts "Change due: #{change}"

new_change = change % 2

change_count += 1

puts new_change.round(2)

new_change = new_change % 1

change_count += 1

puts new_change.round(2)

new_change = new_change % 0.25

change_count += 1

puts new_change.round(2)

new_change = new_change % 0.10

change_count += 1

puts new_change.round(2)

new_change = new_change % 0.05

change_count += 1

puts new_change.round(2)

puts "Number of coins: #{change_count}"
