library = []

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

  user_books = []

  if choice == 1

    library.each_with_index do |book, index|
      book.each { |key| puts "#{index + 1}: #{key[0]} (#{key[1]} pages)" }
    end

  elsif choice == 2

    print "Enter the book index: "
    book_index = gets.chomp.to_i

    user_books.push(library[book_index - 1])
    library.delete_at(book_index - 1)

    puts user_books

  else
    puts "Try again"
  end

  
end

puts

user_books.each do |book|
  puts book
end

puts

library.each_with_index do |book, index|
  book.each { |key| puts "#{index + 1}: #{key[0]} (#{key[1]} pages)" }
end