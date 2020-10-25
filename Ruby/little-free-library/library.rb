def create_libary(max_books)
  library = []

  max_books.times do |index|

    book = {"Book #{index + 1}" => rand(200)}
    library << book
  
  end

  library
end

def display_books(library)

  library.each_with_index do |book, index|
    book.each { |key| puts "#{key[0]} (#{key[1]} pages)" }
  end

end

def take_book(library, book_choice)
  rup = ""

  library.each_with_index do |book, index|
    book.each do |key|
      if key[0] == book_choice
        rup = book
        library.delete(book)
      end
    end
  end

  rup

end

def return_book(library, book_choice)
  library << book_choice

  book_choice
end

max_books = 18

library = create_libary(max_books)
user_books = []

choice = 0

until choice == 4
  puts "What would you like to do?"
  puts "1 - view the library"
  puts "2 - take a book"
  puts "3 - return a book"
  puts "4 - exit"
  print "Enter your choice: "

  choice = gets.chomp.to_i

  puts

  case choice
  when 1

    display_books(library)

  when 2

    print "What book would you like to take? "

    book_choice = gets.chomp

    user_books << take_book(library, book_choice)

  when 3

    print "What book would you like to return? "

    book_choice = gets.chomp

    book_found = false

    book_to_return = {}

    user_books.each do |book|
      book.each do |key|

        if key[0] == book_choice
          book_found = true
          book_to_return = book
        end

      end
    end

    unless book_found
      puts "You can only return a book you have!"
      print "What book would you like to return? "

      book_choice = gets.chomp
    end

    user_books.delete(return_book(library, book_to_return))
    
  end

  puts
end

puts "Users' books"
print user_books

puts

puts "Library"
print library
