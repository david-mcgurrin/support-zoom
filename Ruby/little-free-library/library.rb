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

    print "What book would you like to take? "

    book_choice = gets.chomp.to_i

    get_book = library[book_choice]

    library.delete_at(book_choice)

    user_books.push(get_book)


  elsif choice == 3

    print "What book would you like to return? "

    book_choice = gets.chomp.to_i

    get_book = user_books[book_choice]

    user_books.delete_at(book_choice)

    library.push(get_book)

  end

  puts
end

puts "Users' books"
puts user_books

puts

puts "Library"
puts library