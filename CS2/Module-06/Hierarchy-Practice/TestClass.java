public class TestClass {

  public static void main(String[] args) {

    // Create objects
    Runner longDistanceRunner = new Runner("Halle", 45,  "Galway Harriers", "professional", 9, 7, "long");
    Athlete runner = new Runner("Jim", 40, "Galway Harriers", "beginner", 3, 3, "short");
    Runner middleDistanceRunner = new Runner("Sonia", 50, "Cork Ramblers", "professional", 7, 8, "middle");
    Runner shortDistanceRunner = new Runner("Sarah", 20, "Cork Ramblers", "beginner", 8, 8, "short");

    Athlete swimmer = new Swimmer("Keelan", 29, "NUIG", "beginner", 500, "breast");
    Swimmer swimmer2 = new Swimmer("Katie", 27, "NUIG", "professional", 1000, "butterfly");


    //
    // Runners

    // Call methods and print strings
    System.out.println(longDistanceRunner.toString());  // LongDistanceRunner object that calls the LongDistanceRunner toString() method

    System.out.println(runner.toString());              // Runner object that calls the Runner toString() method

    System.out.println(middleDistanceRunner.toString()); // ShortDistanceRunner object that calls the Runner toString() method as it doesn't hace its own

    System.out.println(shortDistanceRunner.toString()); // Runner object that calls the LongDistanceRunner toString() method due to method overriding

    System.out.println(middleDistanceRunner.getName() + " has a top speed is " + middleDistanceRunner.getSpeed());

    middleDistanceRunner.increaseSpeed();

    System.out.println(middleDistanceRunner.getName() + " has a top speed is " + middleDistanceRunner.getSpeed());

    //
    // Errors

    // Method undefined since Runner type
    // runner.increaseSpeed();

    // Type mismatch when calling a subclass to create a new superclass
    // Runner longDistanceRunner2 = new Athlete("Thomas", 31, "Sligo AC", "intermediate");


    System.out.println("\n---\n");


    //
    // Swimmers

    System.out.println(swimmer.toString()); // Created as an athlete but the swimmer toString() method will override the ahtlete
    
    // Print out the two simmer methods
    System.out.println(swimmer2.toString());
    System.out.println(swimmer2.getName() + " specialises in the " + swimmer2.getDistance() + " meter distance");
    System.out.println(swimmer2.getName() + " is part of the " + swimmer2.getClub() + " club");
    swimmer2.moveClub("GMIT");
    System.out.println(swimmer2.getName() + " is part of the " + swimmer2.getClub() + " club");


    //
    // Errors

    // Created as an athlete so doesn't have access to this method
    // System.out.println((swimmer.getDistance()));

  }
}
