print "How much change is owed? "
input = gets.chomp

until input.to_f.to_s == input
  print "Try again: "
  input = gets.chomp
end

input = input.to_f

rounded_change = (input * 20).round / 20.0

coins = {
  toonie: 2,
  loonie: 1,
  quarter: 0.25,
  dime: 0.10,
  nickel: 0.05
}

coins_arr = [0, 0 , 0, 0, 0]

puts rounded_change

print coins

puts

coins.each_with_index do |(key, value), index|

  coint_count = (rounded_change / coins[key]).floor
  rounded_change = (rounded_change % coins[key]).round(2)

  puts coint_count
  puts rounded_change

  coins_arr[index] = coint_count
end

print coins_arr

puts


coins_array = ["toonie", "loonie", "quarter", "dime", "nickel"]


sentence = ""


coins_arr.each_with_index do |coin, index|

  sentence += "#{coin} #{coins_array[index]}" if coin.to_i > 0

  sentence += index == (coins_arr.length - 2) ? " and " : ", " if coin.to_i > 0 && index != coins_arr.length - 1

end

puts sentence