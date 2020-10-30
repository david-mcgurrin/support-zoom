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
    book.each { |key, value| puts "#{key} (#{value} pages)" }
  end

end

def take_book(library, book_choice)

  book_to_take = ""

  library.each do |book|
    book.each do |key, value|
      if key.downcase == book_choice
        book_to_take = book
        library.delete(book)
      end
    end
  end

  puts book_to_take.length > 0 ? "Book taken out!" : "Book not found in the library.\nPlease try again!"

  book_to_take if book_to_take.length > 0

end

def return_book(library, book_choice)

  library << book_choice

  puts "Book returned!"

  book_choice

end

max_books = 18

library = create_libary(max_books)

user_books = []

choice = 0

until choice == 4
  puts "What would you like to do?"
  puts "  1 - view the library"
  puts "  2 - take a book"
  puts "  3 - return a book"
  puts "  4 - exit"
  print "Enter your choice: "

  choice = gets.chomp.to_i

  puts

  case choice
  when 1

    display_books(library)

  when 2

    print "What book would you like to take? "

    book_choice = gets.chomp.downcase

    user_books << take_book(library, book_choice)

  when 3


    print "What book would you like to return? "

    book_choice = gets.chomp.downcase
    
    if user_books.compact.length > 0
      
      book_to_return =  user_books.find { |book| book.first[0].downcase.include? book_choice }

      if book_to_return
        user_books.delete(return_book(library, book_to_return))
      else
        puts "You can only return a book you have!"
      end
    
    else 
      puts "You have to take out a book before you return one!"
    end

  end

  puts
end

puts "Users' books:"
print user_books.compact

puts

puts "Library:"
print library
