def customized_list_of_multiples(multiples_of, size)

  list = size.times.map do |index|
    (index + 1) * multiples_of
  end
    
  if block_given?
    yield (list)
  end

  print list
  puts

end
