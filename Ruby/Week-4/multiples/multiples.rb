def customized_list_of_multiples(multiples_of, size)

  list = size.times.map do |index|
    (index + 1) * multiples_of
  end
    
  list = yield (list) if block_given?
  
  print list
  puts

end

puts "Method call with no block"
customized_list_of_multiples(5, 5)

puts "\nMethod call with block which doubles the original numbers"
customized_list_of_multiples(5, 5) { |list| list.map { |x| x += x } }

puts "\nMethod call with block which squares the original numbers"
customized_list_of_multiples(5,5) do |list|
  
  list.each_with_index do |num, index|
    list[index] = num * num
  end

end
