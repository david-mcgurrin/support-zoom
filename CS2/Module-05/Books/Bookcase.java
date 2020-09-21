//import java.awt.print.Book;

public class Bookcase {

  private static final int BOOKCASE_CAPACITY = 50; // 10 books on 5 different shelves

  private Book[] bookcase;    // Declare array housing Book objects


  // Constructor to set up the bookcase array
  public Bookcase() {

    bookcase = new Book[BOOKCASE_CAPACITY];

  }

  // Method to return the book
  public Book getBookFromBookcase(Book book) {
    
    // Loop through the outter array 
    for (int i = 0; i < bookcase.length; i++) {

      // If we find the book
      if (bookcase[i] == book) {
        bookcase[i] = null; // Set the position in the bookcase array to be null
        return book; // Return the book
      }
      
    }

    return null;
  }
  
  // Method to initially populate the bookcase by adding each book
  public void addBookToBookcase(Book b, int i) {

    bookcase[i] = b;
    
  }

  // Method to return a book back onto the bookcase
  public void returnBookToBookcase(Book b) {

    // Loop through the array
    for (int i = 0; i < bookcase.length; i++) {
    
      // Look for an empty place in the bookcase and add the book there
      if (bookcase[i] == null) {
        bookcase[i] = b;
      }
    
    }
  }

}
