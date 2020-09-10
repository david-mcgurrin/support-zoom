package data; // Must include the package

public class Article {

  // Declare the variables
  private String title;
  private String author;
  private Issue issue;

  // Constructor
  public Article(String title, String author, Issue issue) {
    this.title = title;
    this.author = author;
    this.issue = issue;
  }

  // Get methods
  public String getTitle() { return title; };

  public String getAuthor() { return author; };
  
  public Issue getIssue() { return issue; };

}
