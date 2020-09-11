public class LongDistanceRunner extends Runner {
  
  // Private variables
  private int endurance;
  private int topSpeed;

  // Constructor
  LongDistanceRunner(String name, int age, String club, int endurance, int topSpeed) {
    super(name, age, club); // Super used to get the superclass constructor
    this.endurance = endurance;
    this.topSpeed = topSpeed;
  }

  // Get methods
  public int getEndurance() {
    return endurance;
  }

  public int getTopSpeed() {
    return super.getSpeed();  // Returns the Athlete Class top speed
  }

  // Helper methods
  public void increaseSpeed() {
    topSpeed ++;
  }

  public void increaseEndurance() {
    endurance ++;
  }

  // Long distance runner toString() method
  public String toString() {
    return super.getName() + " is a long distance runner who is " + super.getAge() + " years old.";
  }

}
