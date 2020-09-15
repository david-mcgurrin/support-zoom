package testing;

public class TestClass {
  
  public static void main(String[] args) {
    
    // Create the object
    OutfitGenerator outfitGenerator = new OutfitGenerator();

    // Call the method to add products to the array
    outfitGenerator.populateArrays();

    int numIterations = 10;

    // Loop added to display multiple generated outfits
    for (int i = 0; i < numIterations; i ++) {

      // Output message to help track the iterations
      System.out.println("########\nRound " + (i + 1) + "\n########");

      // Variables for the while loop
      int counter = 0;
      Boolean styling = false;

      // Keep iterating over the Outfit Generator until a decent outfit is found
      while (!styling) {
        styling = outfitGenerator.checkStyle();
        counter ++;
      }

      // Output the time it took
      if (counter == 1) {
        System.out.println("It took the Outfit Generator 1 attempt to find a good outfit. How good is that!?");
      } else {
        System.out.println("It took the Outfit Generator " + counter + " attempts to find a good outfit. Wasn't it worth it though!");
      }

      // Output spacing on all bar the last iteration
      if (i != (numIterations - 1)) {
        System.out.println("\n\n\n");
      }
    }
  }
}
