public class Reader {
  
  private String name;                  // Give each reader a name
  private int numBooksTakenOut;         // Track how many books they currently have out
  private Book currentBook;             // Track the current book
  private int currentBookShelfNumber;   // Track the shelf the books is on so we can place it back in the right position

  // Constructor sets up the name and initialises the book info to null/0
  Reader(String name) {
    this.name = name;
    numBooksTakenOut = 0;
    currentBook = null;
    currentBookShelfNumber = 0;
  }

  // Getter
  public Book getBook() { return currentBook; }

  // Method that gets the book from the bookcase
  public String takeBook(Bookcase bookcase, Book book) {
    
    if (numBooksTakenOut < 1) {

      // Find the shelf that the book is on
      currentBookShelfNumber = bookcase.getShelf(book);

      // Using the shelf we then get the book
      // Needs to be done in this order otherwise the shelf will be set to null
      currentBook = bookcase.getBookFromShelf(book, currentBookShelfNumber);
      
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

      // Call the method to add the book back on the shelf and output a message
      bookcase.addBookToShelf(b, currentBookShelfNumber + 1); // Add 1 since the bookshelves start at 1 rather than 0
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
