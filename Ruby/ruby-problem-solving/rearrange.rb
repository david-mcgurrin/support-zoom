begin
  print "Enter a number: "
  number = Integer(gets)
rescue
  retry
end

numbers = number.to_s.split('');

if numbers.first == "-"

  numbers.shift

  number_array_length = numbers.length

  minimum_number = numbers.select {|n| n.to_i > 0}.min

  sorted_array = numbers.sort.join('').to_i.to_s.split('')

  sorted_array.shift

  largest_num = minimum_number.to_i * (10 ** (number_array_length.to_i - 1))

  remaining_num = sorted_array.join('').to_i

  puts (largest_num + remaining_num) * -1

else

  sorted_array = numbers.sort.reverse

  puts sorted_array.join('').to_i
  
end
