def get_number(index)

  begin
    print "Enter number #{index}: "
    num = Integer(gets)
  rescue
    retry
  end

end

number1 = get_number(1)
number2 = get_number(2)

puts "Max Number is #{[number1, number2].max}"
