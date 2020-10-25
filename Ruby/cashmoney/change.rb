def calculate_change(change)

  coins = {
    toonie: 2,
    loonie: 1,
    quarter: 0.25,
    dime: 0.10,
    nickel: 0.05
  }
    
  coins_count = [0, 0 , 0, 0, 0]
  
  coins.each_with_index do |(key, value), index|
    coin_count = (change / coins[key]).floor
    change = (change % coins[key]).round(2)
    coins_count[index] = coin_count
  end

  coins_count

end


def output_change(coins_count)

  coin_names = ["toonie", "loonie", "quarter", "dime", "nickel"]
  coin_amounts_array = []

  coins_count.each_with_index do |coin, index|
    amount = "#{coin} #{coin_names[index]}" if coin.to_i > 0
    amount += "s" if coin.to_i > 1

    coin_amounts_array << amount

    amount = nil
  end

  # Remove nil values
  coin_amounts_array = coin_amounts_array.compact

  final_sentence = ""

  coin_amounts_array.each_with_index do |amount, index|
    final_sentence += amount
    final_sentence += index == (coin_amounts_array.length - 2) ? " and " : ", " if amount.to_i > 0 && index != coin_amounts_array.length - 1
  end

  puts final_sentence

end


valid_input = false

until valid_input

  print "How much change is owed? "
  input = gets.chomp.to_f

  valid_input = true unless input == 0.0 || input < 0

end

# Used due to the Canadian rounding rules
rounded_change = (input * 20).round / 20.0

coins_count = calculate_change(rounded_change)

output_change(coins_count)
