package data; // Must include the package

// Import utility classes
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BibliographyDatabase {

  // Declare the journals ArrayList variable
  private ArrayList<Journal> journals;
  
  // Constructor
  public BibliographyDatabase() {
    journals = Journal.getSampleJournals(); // Only thing we do is import the sample journals from the Journal class
  }

  //
  // Helper methods

  public void addJournal(ArrayList<Journal> js, Journal j) {
    Journal.addJournalToBibliography(js, j);

  }

  public void removeJournal(ArrayList<Journal> js, Journal j) {
    Journal.removeJournalFromBibliography(js, j);

  }

  public void addIssue(Journal j, Issue i) {
    j.addIssueToJournal(i);
  }


  public void removeIssue(Journal j, Issue i) {
    j.removeIssueFromJournal(i);

  }

  public void addArticle(Issue i, Article a) {
    i.addArticleToIssue(a);
  }

  public void removeArticle(Issue i, Article a) {

    i.removeArticleFromIssue(a);

  }

  public void showIssues(int i) {
    journals.get(i).displayIssueChoices();
  }

  //
  // UI Operations

  // Method to print the articles in a certain year
  public void printArticles(int year) {

    Boolean noArticle = true; // Add variable to determine whether there is a match for the given year

    // Loop through the journals
    for (int i = 0; i < journals.size(); i++) {

      // Create issues ArrayList
      ArrayList<Issue> currentIssues = journals.get(i).getIssues();

      // Loop through issues
      for (int j = 0; j < currentIssues.size(); j++) {

        // Create articles ArrayList
        ArrayList<Article> currentArticles = currentIssues.get(j).getArticles();

        // Loop through articles
        for (int k = 0; k < currentArticles.size(); k++) {

          // If the year matches then print out the details
          if (currentIssues.get(j).getYear() == year) {

            System.out.println(currentArticles.get(k).getAuthor()
            + ". " + currentArticles.get(k).getTitle()
            + ". " + journals.get(i).getTitle()
            + ". " + currentIssues.get(j).getVolumeNum()
            + ". " + currentIssues.get(j).getYear());

            // Article was found
            noArticle = false;

          }
        }
      }
    }

    // If no article is found then print out a message to the user
    if (noArticle) {
      System.out.println("No articles found for that year. Try again within the range indicated.");
    }

  }

  // Method to add a new article to an issue
  public void addNewArticleToIssue(int issueChoice, String author, String title) {
    
    // Declare the variables
    Article newArticle;
    Issue currentIssue = null;

    // Get the issues for the first journal
    ArrayList<Issue> currentIssues = journals.get(0).getIssues();

    // Check if the choice matches the suggested choices
    if (issueChoice == 1 || issueChoice == 2) {

      // If the choice is 1 add the article to the first issue
      if (issueChoice == 1) {
        currentIssue = currentIssues.get(0);      
      }

      // If the choice is 2 add the article to the second issue
      else if (issueChoice == 2) {
        currentIssue = currentIssues.get(1);
      }

      newArticle = new Article(title, author, currentIssue);

      currentIssue.addArticleToIssue(newArticle);
    }
    // Otherwise print out a message
    else {

      System.out.println("Must choose either 1 or 2");

    }
  }

  // Method to find the most published author
  public void findMostPublishedAuthor() {

    ArrayList<Article> allArticles = new ArrayList<Article>();  // Create a new ArrayList to capture all the articles
    HashMap<String, Integer> articlesHashMap = new HashMap<String, Integer>();  // Create a hashmap

    // Loop through journals
    for (int i =  0; i < journals.size(); i++) {

      ArrayList<Issue> currentIssues = journals.get(i).getIssues();

      // Loop through issues
      for (int j =  0; j < currentIssues.size(); j++) {

        ArrayList<Article> currentArticles = currentIssues.get(j).getArticles();

        // Loop through articles
        for (int k =  0; k < currentArticles.size(); k++) {

          // Add the article to the new ArrayList
          allArticles.add(currentArticles.get(k));
        }
      }
    }

    // Loop through the all articles ArrayList
    for (int i = 0; i < allArticles.size(); i++) {
    
      // Check if the author is in the hashmap
      if (articlesHashMap.containsKey(allArticles.get(i).getAuthor())) {

        // Updatd the count for the current author
        articlesHashMap.put(allArticles.get(i).getAuthor(), articlesHashMap.get(allArticles.get(i).getAuthor()) + 1);

      }

      // Add the author to the hashmap with the count of 1
      else {
        articlesHashMap.put(allArticles.get(i).getAuthor(), 1);
      }
    
    }

    // Create the set
    Set<Map.Entry<String, Integer> > set = articlesHashMap.entrySet();

    String mostPublishedAuthor = ""; 
    int articleCount = 0;

    // Loop through hashmap
    for (Map.Entry<String, Integer> article: set) {

      // Check for the highest count
      if (article.getValue() > articleCount) {

        articleCount = article.getValue();

        // If the current count is higher then set the most published author to the key of that key:value pair
        mostPublishedAuthor = article.getKey();
      }

    }

    // Output the author
    System.out.println("The most proflific article author is " + mostPublishedAuthor);

  }
}
