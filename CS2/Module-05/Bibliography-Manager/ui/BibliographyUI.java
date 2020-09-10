package ui; // Must include the package

import data.BibliographyDatabase; // Import the BibliographyDatabase from the data package
import java.util.Scanner;         // Import the Scanner class


public class BibliographyUI {

  // DEclare the BibliographyDatabase variable
  private BibliographyDatabase bibliographyDB;

  BibliographyUI() {
    bibliographyDB = new BibliographyDatabase();  // Initialise the sample journals
  }

  void performJournalOperations() {

    // Declare variables used for interacting with the terminal
    int choiceIndex;
    int enteredYear;
    int issueChoice;

    // Intro banner
    System.out.println("\n#####################################");
    System.out.println("Welcome to the Bibliography Database!");
    System.out.println("#####################################\n");

    // Do - while loop to continue running until the exit choice has been entered
    do {

      // Choice list
      System.out.println("You may perform the following operations: \n\n"
                        + "  1) Find articles from a given year\n"
                        + "  2) Add an article to an issue\n"
                        + "  3) Find the most-published author'\n"
                        + "  4) Exit\n");


      System.out.print("Please enter your choice (1, 2, or 3) ");

      Scanner input = new Scanner(System.in); // Set up the scanner
      input.useDelimiter("\n");  // Set the delimiter to a new line to ensure full lines of text with spaces can be used

      // Get the int for the different choices
      choiceIndex = input.nextInt();

      System.out.println("");

      if (choiceIndex == 1) {

        System.out.print("What year are you interested in? (Main issues are from the years 2000 - 2003): ");
        
        // Get the year
        enteredYear = input.nextInt();

        System.out.println("\n############");
        System.out.println("Operation 1:");
        System.out.println("############\n");

        // Call the method and pass in the year as a parameter
        bibliographyDB.printArticles(enteredYear);
        
        System.out.println("\n");

      } else if (choiceIndex == 2) {

        // Declare the variables
        String author;
        String title;
        String stringInput;

        System.out.println("Here are the available issues: \n");

        // Output the issues for the first journal
        bibliographyDB.showIssues(0);

        System.out.print("What issue would you like to add to (1 or 2): ");
        
        issueChoice = input.nextInt();  // Get the choice

        System.out.print("Please specify the article author: ");
        stringInput = input.next(); 

        author = stringInput; // Get the author name

        System.out.print("Please specify the article title: ");
        stringInput = input.next();

        title = stringInput;  // Get the article name

        System.out.println("\n############");
        System.out.println("Operation 2:");
        System.out.println("############\n");

        // Output indication that it has been added
        System.out.println("The book titled " + title + " by " + author + " has been added to the issue");

        // Call the method to add the new article
        bibliographyDB.addNewArticleToIssue(issueChoice, author, title);

        System.out.println("\n");

      } else if (choiceIndex == 3) {

        System.out.println("\n############");
        System.out.println("Operation 3:");
        System.out.println("############\n");

        // Call the method to output the most published author
        bibliographyDB.findMostPublishedAuthor();

        System.out.println("\n");

      }
    } while (choiceIndex != 4);

    System.out.println("");
    System.out.println("Bye!");

  }

  public static void main(String[] args) {
    
    // Create a BibliographyUI object 
    BibliographyUI ui = new BibliographyUI();

    // Call the method to start the UI
    ui.performJournalOperations();

  }
}
