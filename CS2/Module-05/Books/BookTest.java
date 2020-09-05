// import java.awt.print.Book;

public class BookTest {

  // Method to populate the bookcase with all the books
  public static void addBooksToBookcase(Bookcase bookcase, Book[] books) {

    int shelfNum = 0;  // Used for tracking the current shelf.

    // Iterate through the array
    for (int i = 0; i < books.length; i++) {
      
      // 10 books per shelf so update this accordingly
      if (i % 10 == 0) {
        shelfNum++;
      }

      // Add the individual book to the shelf
      bookcase.addBookToShelf(books[i], shelfNum);
      
    }

  }

  public static void main(String[] args) {
    
    // Create the bookcase object
    Bookcase bookcase = new Bookcase();

    // Declare and initialise the array of books. Each element being a new Book object
    Book[] books = new Book[] {
      new Book("Under the Hawthorn Tree", "Marita Conlon-McKenna", "101-2-34-56"),
      new Book("The Butcher Boy", "Patrick McCabe", "123-4-56-78"),
      new Book("The Snapper", "Roddy Doyle", "211-2-33-44"),
      new Book("Normal People", "Sally Rooney", "323-4-56-56"),
      new Book("Ulysses", "James Joyce", "411-1-22-22"),
      new Book("The Picture of Dorian Gray", "Oscar Wilde", "555-5-55-55"),
      new Book("Dracula", "Bram Stoker", "666-1-22-33"),
      new Book("Gulliver's Travels", "Jonathan Swift", "700-7-17-26"),
      new Book("The Third Policeman", "Flann O'Brien", "812-3-19-67"),
      new Book("Waiting for Godot", "Samuel Beckett", "919-5-43-43"),
      new Book("The Hobbit", "J.R.R Tolkien", "100-1-00-10"),
      new Book("1984", "George Orwell", "198-4-00-11"),
      new Book("To Kill a Mockingbird", "Harper Lee", "196-0-10-12"),
      new Book("The Great Gatsby", "F. Scott Fitzgerald", "193-0-10-13"),
      new Book("Catch 22", "Joseph Heller", "601-5-22-14"),
      new Book("The Catcher in the Rye", "J.D. Salinger", "196-0-30-15"),
      new Book("Moby Dick", "Hermann Melville", "188-1-20-16"),
      new Book("Frankenstein", "Mary Shelley", "185-4-32-17"),
      new Book("Jane Eyre", "Charlotte Bronte", "175-1-20-18"),
      new Book("Of Mice and Men", "John Steinbeck", "404-5-18-19"),
      new Book("Harry Potter 1", "J.K. Rowling", "303-1-22-01"),
      new Book("Harry Potter 2", "J.K. Rowling", "303-1-22-02"),
      new Book("Harry Potter 3", "J.K. Rowling", "303-1-22-03"),
      new Book("Harry Potter 4", "J.K. Rowling", "303-1-22-04"),
      new Book("Harry Potter 5", "J.K. Rowling", "303-1-22-05"),
      new Book("Harry Potter 6", "J.K. Rowling", "303-1-22-06"),
      new Book("Harry Potter 7", "J.K. Rowling", "303-1-22-07"),
      new Book("Lord of the Rings 1", "J.R.R Tolkien", "111-1-01-01"),
      new Book("Lord of the Rings 2", "J.R.R Tolkien", "222-2-02-02"),
      new Book("Lord of the Rings 3", "J.R.R Tolkien", "333-3-03-03"),
      new Book("The Art of War", "Sun Tzu", "104-2-10-00"),
      new Book("The Selfish Gene", "Richard Dawkins", "114-2-19-76"),
      new Book("The Prince", "Machiavelli", "224-8-77-66"),
      new Book("A Short History of Nearly Everything", "Bill Bryson", "334-1-23-45"),
      new Book("Fever Pitch", "Nick Hornby", "444-5-66-77"),
      new Book("How to Win Friends and Influence People", "Dale Carnegie", "504-6-77-77"),
      new Book("The Right Stuff", "Tom Wolfe", "664-3-19-69"),
      new Book("Blink", "Malcolm Gladwell", "734-0-20-20"),
      new Book("In Cold Blood", "Truman Capote", "824-4-20-20"),
      new Book("The Power of Habit", "Charles Duhig", "974-9-00-10"),
      new Book("Ireland", "Lonely Planet", "101-1-01-01"),
      new Book("Wales", "Lonely Planet", "111-1-11-11"),
      new Book("Spain", "Lonely Planete", "121-1-21-21"),
      new Book("Germany", "Lonely Planet", "131-1-31-31"),
      new Book("France", "Lonely Planet", "141-1-41-41"),
      new Book("Leitrim", "Lonely Planet", "151-1-51-51"),
      new Book("Brazil", "Lonely Planet", "161-1-61-61"),
      new Book("China", "Lonely Planet", "171-1-71-71"),
      new Book("Japan", "Lonely Planet", "181-1-81-81"),
      new Book("Canada", "Lonely Planet", "191-1-91-91")
    };

    // Call method to populate the bookcase
    addBooksToBookcase(bookcase, books);


    /* Testing - create readers and take/return books */

    // Standard withdraw and deposit
    Reader person1 = new Reader("Aaron");

    String newBookPerson1 = person1.takeBook(bookcase, books[49]);

    System.out.println(newBookPerson1);

    person1.returnBook(bookcase, books[49]);


    // Standard withdraw
    Reader person2 = new Reader("Betty");

    String newBookPerson2 = person2.takeBook(bookcase, books[49]);

    System.out.println(newBookPerson2);


    // Attempt to withdraw book someone else has withdrawn
    Reader person3 = new Reader("Charlie");

    String newBookPerson3 = person3.takeBook(bookcase, books[49]);

    System.out.println(newBookPerson3);

    // Standard withdraw while trying to return the wrong book
    newBookPerson3 = person3.takeBook(bookcase, books[32]);

    System.out.println(newBookPerson3);

    person3.returnBook(bookcase, books[12]);

    person3.returnBook(bookcase, books[32]);


    // Attempt to withdraw more than one book
    Reader person4 = new Reader("Dawn");

    String newBookPerson4 = person4.takeBook(bookcase, books[1]);

    System.out.println(newBookPerson4);

    newBookPerson4 = person4.takeBook(bookcase, books[2]);

    System.out.println(newBookPerson4);
    
  }
}
