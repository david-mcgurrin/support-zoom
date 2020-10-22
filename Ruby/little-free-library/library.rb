library = []
user_books = []

count = 1

max_books = 18

while (count <= max_books)

  book = {"Book #{count}" => rand(200)}
  library.push(book)
  count += 1

end

choice = 0

until choice == 4
  puts "What would you like to do?"
  puts "1 - view the library"
  puts "2 - take a book"
  puts "3 - return a book"
  print "Enter your choice: "

  choice = gets.chomp.to_i

  puts

  if choice == 1

    library.each_with_index do |book, index|
      book.each { |key| puts "#{index + 1}: #{key[0]} (#{key[1]} pages)" }
    end

  elsif choice == 2

    user_books.push(library.pop)

  elsif choice == 3

    library.push(user_books.pop)

  end

end

puts "Users' books"
puts user_books

puts

puts "Library"
puts library