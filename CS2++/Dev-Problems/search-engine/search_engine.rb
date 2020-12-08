product_listing = []
File.open('products_small.csv', 'r').each_with_index do |line, index|
  next if index == 0
  line_array = line.split(",")
  product_listing << {id:  line_array[0].to_i, name: line_array[1].downcase  }
end

inverted_index = {}
product_listing.each do |product|
  product[:name].split.each do |token|
    inverted_index[token] ||= []
    inverted_index[token] << product[:id]
  end
end

# puts inverted_index["steel"]
# => [1, 2]

# puts inverted_index["steel"] & inverted_index["bag"]
# => [1]

print "Please enter your search: "
input = gets.chomp

print input

matches = inverted_index[input]
matches.each do |match|
  puts product_listing[match][:name]
end
