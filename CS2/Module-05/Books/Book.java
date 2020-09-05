public class Book {

  // Private attribrutes as will only be output via the toString() method
  private String title;
  private String author;
  private String ISBN;
  
  // Constructor
  public Book(String title, String author, String ISBN)
  {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
  }

  // Getters
  public String getTitle() { return title; }

  public String getAuthour() { return author; }

  public String getISBN() { return ISBN; }

  // Output the book attribrutes
  public String toString() {
    return "the book titled " + title + " by author " + author + " (ISBN: " + ISBN + ")";
  }

}
