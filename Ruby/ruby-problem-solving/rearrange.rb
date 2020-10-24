def negative_sort(num)
  
  num.shift

  minimum_number = num.select {|n| n.to_i > 0}.min.to_i

  largest_num = minimum_number * (10 ** (num.length.to_i - 1))

  remaining_num = num.sort.join('').split('').select {|n| n.to_i > minimum_number}.join('').to_i
  
  (largest_num + remaining_num) * -1

end

print "Enter a number please: "
number = gets.chomp

until number.to_i.to_s == number
  print "Must be an integer. Please try again: "
  number = gets.chomp
end

number = number.to_i

numbers = number.to_s.split('')

sorted = numbers.first == "-" ? negative_sort(numbers) : numbers.sort.reverse.join("").to_i

puts sorted
