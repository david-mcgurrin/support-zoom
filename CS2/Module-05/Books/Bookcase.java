//import java.awt.print.Book;

public class Bookcase {

  private static final int SHELF_CAPACITY = 10; // 10 books per shelf

  private Book[][] fullBookcase;    // Declare multi dimensional array housing Book objects

  private int[] numOnEachShelf;     // Array to house the number of books on each shelf

  private Book[] shelf1;
  private Book[] shelf2;
  private Book[] shelf3;
  private Book[] shelf4;
  private Book[] shelf5;

  // Static since will be updated with each new object created
  private static int numOnShelf1 = 0;
  private static int numOnShelf2 = 0;
  private static int numOnShelf3 = 0;
  private static int numOnShelf4 = 0;
  private static int numOnShelf5 = 0;

  // Constructor to set up the arrays
  public Bookcase() {
    shelf1 = new Book[SHELF_CAPACITY];
    shelf2 = new Book[SHELF_CAPACITY];
    shelf3 = new Book[SHELF_CAPACITY];
    shelf4 = new Book[SHELF_CAPACITY];
    shelf5 = new Book[SHELF_CAPACITY];

    fullBookcase = new Book[][] {
      shelf1,
      shelf2,
      shelf3,
      shelf4,
      shelf5
    };

    numOnEachShelf = new int[] {
      numOnShelf1,
      numOnShelf2,
      numOnShelf3,
      numOnShelf4,
      numOnShelf5
    };    

  }

  // Method to get the shelf number. This is used to return the book to the same place on the shelf
  public int getShelf(Book book) {
    
    // Loop through the outter array 
    for (int i = 0; i < fullBookcase.length; i++) {

      // Loop through each shelf
      for (int j = 0; j <  fullBookcase[i].length; j++) {

        if (fullBookcase[i][j] == book) {
          return i; // Return the shelf number
        }

      }
    }

    return 0;
  }

  // Method to return the book from the shelf
  public Book getBookFromShelf(Book book, int shelf) {
    
    for (int i = 0; i <  fullBookcase[shelf].length; i++) {

      if (fullBookcase[shelf][i] == book) {

        fullBookcase[shelf][i] = null;  // Set the array element to null so others can't take it out

        numOnEachShelf[shelf]--;  // Reduce the number of books on the shelf

        return book;  // Return the book
      }

    }

    return null;
  }
  
  public void addBookToShelf(Book b, int shelf) {


    switch(shelf) {

      // Shelf starts at 1 rather than 0
      case 1:

        // Check if the shelf has reached the max number allowed per shelf
        if (numOnShelf1 < SHELF_CAPACITY) {

          // Set the shelf element to be the book passed in
          shelf1[numOnEachShelf[shelf - 1]] = b;

          // Increment the count in the shelf counter array
          numOnEachShelf[shelf - 1]++;
        } else {
          System.out.println("Too many books on shelf " + shelf + ". Use another one");
        }
        break;

      case 2:

        if (numOnEachShelf[shelf - 1] < SHELF_CAPACITY) {
          shelf2[numOnEachShelf[shelf - 1]] = b;
          numOnEachShelf[shelf - 1]++;
        } else {
          System.out.println("Too many books on shelf " + shelf + ". Use another one");
        }
        break;

      case 3:
        if (numOnEachShelf[shelf - 1]< SHELF_CAPACITY) {
          shelf3[numOnEachShelf[shelf - 1]] = b;
          numOnEachShelf[shelf - 1]++;
        } else {
          System.out.println("Too many books on shelf " + shelf + ". Use another one");
        }
        break;

      case 4:

        if (numOnEachShelf[shelf - 1] < SHELF_CAPACITY) {
          shelf4[numOnEachShelf[shelf - 1]] = b;
          numOnEachShelf[shelf - 1]++;
        } else {
          System.out.println("Too many books on shelf " + shelf + ". Use another one");
        }
        break;

      case 5:

        if (numOnEachShelf[shelf - 1] < SHELF_CAPACITY) {
          shelf5[numOnEachShelf[shelf - 1]] = b;
          numOnEachShelf[shelf - 1]++;
        } else {
          System.out.println("Too many books on shelf " + shelf + ". Use another one");
        }
        break;

    }
   
  }

}
