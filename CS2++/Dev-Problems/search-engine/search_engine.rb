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

def list_duplicates(array)
  duplicates = array.select { |e| array.count(e) > 1 }
  duplicates.uniq
end

# puts inverted_index["steel"]
# => [1, 2]

# puts inverted_index["steel"] & inverted_index["bag"]
# => [1]

print "Please enter your search: "
input = gets.chomp.split(" ")

print input
print input.length
puts

matches = []

input.each do |i|
  puts i
  matches << inverted_index[i]
end

dupes = list_duplicates(matches.flatten)

dupes.each do |dup|
  puts product_listing[dup][:name]
end

# print matches

# matches.each do |match|
#   match.each do |m|
#     puts product_listing[m][:name]
#   end
# end