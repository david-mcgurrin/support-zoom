def calculate_change(new_change)

  toonie_count = 0
  loonie_count = 0
  quarter_count = 0
  dime_count = 0
  nickel_count = 0
  change_count = 0
  coins_array = []

  rounded_change = (new_change * 20).round / 20.0

  while rounded_change > 0

    if rounded_change >= 2
      toonie_count = (rounded_change / 2).floor
      rounded_change = (rounded_change % 2).round(2)

    elsif rounded_change >= 1
      loonie_count = (rounded_change / 1).floor
      rounded_change = (rounded_change % 1).round(2)

    elsif rounded_change >= 0.25
      quarter_count = (rounded_change / 0.25).floor
      rounded_change = (rounded_change % 0.25).round(2)

    elsif rounded_change >= 0.10
      dime_count = (rounded_change / 0.10).floor
      rounded_change = (rounded_change % 0.10).round(2)

    elsif rounded_change >= 0.05
      nickel_count = (rounded_change / 0.05).floor
      rounded_change = (rounded_change % 0.05).round(2)

    end

    change_count = toonie_count + loonie_count + quarter_count + dime_count + nickel_count

  end

  toonies = toonie_count > 0 ? "#{toonie_count} toonie#{toonie_count > 1 ? "s" : ""}" : ""
  loonies = loonie_count > 0 ? "#{loonie_count} loonie#{loonie_count > 1 ? "s" : ""}" : ""
  quarters = quarter_count > 0 ? "#{quarter_count} quarter#{quarter_count > 1 ? "s" : ""}" : ""
  dimes = dime_count > 0 ? "#{dime_count} dime#{dime_count > 1 ? "s" : ""}": ""
  nickels = nickel_count > 0 ? "#{nickel_count} nickel#{nickel_count > 1 ? "s" : ""}" : ""

  if toonie_count > 0
    coins_array.push(toonies)
  end

  if loonie_count > 0
    coins_array.push(loonies)
  end

  if quarter_count > 0
    coins_array.push(quarters)
  end

  if dime_count > 0
    coins_array.push(dimes)
  end

  if nickel_count > 0
    coins_array.push(nickels)
  end

  coins_array.each_with_index do |coin, index|
    print "#{coin}"

    if index == coins_array.length - 1
      print "."
    elsif index == coins_array.length - 2
      print " and "
    else
      print ", "
    end
  end

  puts "\nTotal coins: #{change_count}"

end

found = false

until found

  print "How much change is owed? "
  change = gets.chomp.to_f

  unless change == 0.0 || change < 0
    found = true
  end

end

calculate_change(change)
