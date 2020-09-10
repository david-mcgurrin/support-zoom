package data; // Must include the package

import java.util.ArrayList; // Import the ArrayList class

public class Journal {

  // Declare the variables
  private String title;
  private ArrayList<Issue> issues;
  private static ArrayList<Journal> journals; // Static as there should only be one ArrayList
                                              // of journals

  // Constructor
  public Journal(String title) {
    this.title = title;
    issues = new ArrayList<Issue>();  // Create an ArrayList of issues that belong to the journal
  }

  // Get methods
  public String getTitle() { return title; };

  public ArrayList<Issue> getIssues() { return issues; };

  // Helper methods
  public static void addJournalToBibliography(ArrayList<Journal> journals, Journal journal) {
    journals.add(journal);
  }

  public static void removeJournalFromBibliography(ArrayList<Journal> journals, Journal journal) {
    journals.remove(journal);
  }

  public void addIssueToJournal(Issue issue) {
    issues.add(issue);
  }

  public void removeIssueFromJournal(Issue issue) {
    issues.remove(issue);
  }

  // Method to show the issue choices in the UI
  public void displayIssueChoices() {

    ArrayList<Issue> findIssues = journals.get(0).getIssues();   // Set as the first journal

    for (int i = 0; i < findIssues.size(); i++) {

      System.out.println("  " + (i + 1) + ") " +
                         "Journal " +  journals.get(0).title +
                         ", Volume Number " + findIssues.get(i).getVolumeNum() + 
                         ", Issue #" + findIssues.get(i).getIssueNum());
    }

    System.out.println("");

  }

  // Method to set up the Bibliography
  public static ArrayList<Journal> getSampleJournals() {

    // Initialise the journals ArrayList
    journals = new ArrayList<Journal>();

    // Create some journals
    Journal j1 = new Journal("Advanced Programming");
    Journal j2 = new Journal("Medicine");

    // Create some issues
    Issue issue1 = new Issue(2000, 2, 11, j1);
    Issue issue2 = new Issue(2001, 2, 22, j1);
    Issue issue3 = new Issue(2000, 3, 43, j2);
    Issue issue4 = new Issue(2003, 4, 44, j2);

    // Create some articles
    Article article1 = new Article("OOP", "Hank Rodgers", issue1);
    Article article2 = new Article("Databases", "Angela Ashbury", issue1);
    Article article3 = new Article("Ruby on Rails", "Hank Rodgers", issue2);
    Article article4 = new Article("Assembly", "Angela Ashbury", issue2);
    Article article5 = new Article("Medication", "Hank Rodgers", issue3);
    Article article6 = new Article("Homeopathy", "Craig Smith", issue3);
    Article article7 = new Article("General Practitioner", "Hank Rodgers", issue4);
    Article article8 = new Article("ER", "Jim Jones", issue4);

    // Add articles to the articles ArrayList for each issue
    issue1.addArticleToIssue(article1);
    issue1.addArticleToIssue(article2);

    issue2.addArticleToIssue(article3);
    issue2.addArticleToIssue(article4);

    issue3.addArticleToIssue(article5);
    issue3.addArticleToIssue(article6);

    issue4.addArticleToIssue(article7);
    issue4.addArticleToIssue(article8);

    // Add issues to the issues ArrayList for each journal
    j1.addIssueToJournal(issue1);
    j1.addIssueToJournal(issue2);
    j2.addIssueToJournal(issue3);
    j2.addIssueToJournal(issue4);

    // Finally add journals to the journal ArrayList
    addJournalToBibliography(journals, j1);
    addJournalToBibliography(journals, j2);

    return journals;
  }

}
