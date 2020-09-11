public class TestClass {

  public static void main(String[] args) {

    // Create objects
    LongDistanceRunner longDistanceRunner = new LongDistanceRunner("Halle", 45,  "Galway Harriers", 9, 7);
    Runner runner = new Runner("Jim", 40, "Galway Harriers");
    Runner shortDistanceRunner = new ShortDistanceRunner("Sonia", 50, "Cork Ramblers", 7, 8);
    Runner longDistanceRunner2 = new LongDistanceRunner("Sarah", 20, "Cork Ramblers", 8, 8);

    Athlete swimmer = new Swimmer("Keelan", 29, "NUIG", 500);
    Swimmer swimmer2 = new Swimmer("Katie", 27, "NUIG", 1000);


    //
    // Runners

    // Call methods and print strings
    System.out.println(longDistanceRunner.toString());  // LongDistanceRunner object that calls the LongDistanceRunner toString() method

    System.out.println(runner.toString());              // Runner object that calls the Runner toString() method

    System.out.println(shortDistanceRunner.toString()); // ShortDistanceRunner object that calls the Runner toString() method as it doesn't hace its own

    System.out.println(longDistanceRunner2.toString()); // Runner object that calls the LongDistanceRunner toString() method due to method overriding

    //
    // Errors

    // Method undefined since Runner type
    // shortDistanceRunner.increaseSoeed();

    // Type mismatch when calling a subclass to create a new superclass
    // LongDistanceRunner longDistanceRunner3 = new Runner("Sligo", "Thomas", 31);


    System.out.println("---");


    //
    // Swimmers

    System.out.println(swimmer.toString()); // Created as an athlete but the swimmer toString() method will override the ahtlete
    
    // Print out the two simmer methods
    System.out.println(swimmer2.toString());
    System.out.println(swimmer2.getName() + " specialises in the " + swimmer2.getDistance() + " meter distance");


    //
    // Errors

    // Created as an athlete so doesn't have access to this method
    // System.out.println((swimmer.getDistance()));

  }
}
