public class Reader {
  
  private String name;                  // Give each reader a name
  private int numBooksTakenOut;         // Track how many books they currently have out
  private Book currentBook;             // Track the current book

  // Constructor sets up the name and initialises the book info to null/0
  Reader(String name) {
    this.name = name;
    numBooksTakenOut = 0;
    currentBook = null;
  }

  // Getter
  public Book getBook() { return currentBook; }

  // Method that gets the book from the bookcase
  public String takeBook(Bookcase bookcase, Book book) {
    
    if (numBooksTakenOut < 1) {

      // Call the method to get the book from the bookcase
      currentBook = bookcase.getBookFromBookcase(book);
      
      // If we find it then increment the counter and return a string that outputs the book that was found
      if (currentBook != null) {
        numBooksTakenOut++; // Increment the counter
        return name + " has taken out " + currentBook;

      } else {

        return "This book is currently withdrawn.";
      }

    }

    // Used if the reader has already taken out a book
    return "Max 1 book allowed out at a time";
  }

  public void returnBook(Bookcase bookcase, Book b) {

    // 
    if (numBooksTakenOut == 1 && b == currentBook) {

      // Call the method to add the book back on the bookcase and output a message
      bookcase.returnBookToBookcase(b);
      System.out.println(name + " has returned " + currentBook);

      currentBook = null; // Set the book to null
      numBooksTakenOut--; // Reduce the counter

    } else if (numBooksTakenOut < 1) {

      System.out.println("You must withdraw a book before depositing one!");
    
    } else {
      System.out.println("You can only deposit the book you withdrew!");
    }
  }


}
