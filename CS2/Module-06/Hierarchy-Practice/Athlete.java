public class Athlete extends Person {

  // Private variables
  private String club;
  private int baseSpeed;      // Set a base speed for each athlete
  private int baseEndurance;  // Set a base endurance for each athlete

  // Constructor
  Athlete(String name, int age, String club) {
    super(name, age); // Super used to get the superclass constructor
    this.club = club;
    this.baseSpeed = 5;
    this.baseEndurance = 5;
  }

  // Get methods
  public String getClub() { return club; };

  public int getEndurance() {
    return baseEndurance;
  }

  public int getSpeed() {
    return baseSpeed;
  }

  // Helper methods
  public void moveClub(String newClub) {
    club = newClub;
  }

  // Athlete toString() method
  public String toString() {
    return super.getName() + " is an ahtlete who is " + super.getAge() + " years old.";
  }

}
