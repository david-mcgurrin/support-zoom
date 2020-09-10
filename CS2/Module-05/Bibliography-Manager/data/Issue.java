package data; // Must include the package

import java.util.ArrayList; // Import the ArrayList class

public class Issue {

  // Declare the variables
  private int year;
  private int volumeNum;
  private int issueNum;
  private ArrayList<Article> articles;
  private Journal journal;

  // Constructor
  public Issue(int year, int volumeNum, int issueNum, Journal journal) {
    this.year = year;
    this.volumeNum = volumeNum;
    this.issueNum = issueNum;
    articles = new ArrayList<Article>();  // Create an ArrayList of articles that belong to the issue
    this.journal = journal;
    
  }

  // Get methods
  public int getYear() { return year; };

  public int getVolumeNum() { return volumeNum; };

  public int getIssueNum() { return issueNum; };

  public ArrayList<Article> getArticles() { return articles; };

  public Journal getJournal() { return journal; };

  // Add a new article to the articles ArrayList
  public void addArticleToIssue(Article a) {
    articles.add(a);
  }

  // Remove an article from the articles ArrayList
  public void removeArticleFromIssue(Article a) {
    articles.remove(a);
  }
  
}
