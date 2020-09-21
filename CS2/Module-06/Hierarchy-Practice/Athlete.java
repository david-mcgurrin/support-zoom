public class Athlete extends Person {

  // Private variables
  private String club;
  private String level;

  // Constructor
  Athlete(String name, int age, String club, String level) {
    super(name, age); // Super used to get the superclass constructor
    this.club = club;
    this.level = level;
  }

  // Get methods
  public String getClub() { return club; };

  public String getLevel() { return level; };

  // Helper methods
  public void moveClub(String newClub) {
    System.out.println("Club changed!");
    club = newClub;
  }

  public void increaseLevel(String newLevel) {
    System.out.println("Level changed!");
    level = newLevel;
  }

  // Athlete toString() method
  public String toString() {
    return super.getName() + " is a " + level + " ahtlete who is " + super.getAge() + " years old.";
  }

}
