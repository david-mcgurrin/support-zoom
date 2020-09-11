public class ShortDistanceRunner extends Runner {
  
  // Private variables
  private int endurance;
  private int topSpeed;

  // Constructor
  ShortDistanceRunner(String name, int age, String club, int endurance, int topSpeed) {
    super(name, age, club); // Super used to get the superclass constructor
    this.endurance = endurance;
    this.topSpeed = topSpeed;
  }
  
  // Get methods
  public int getEndurance() {
    return endurance;
  }

  public int getTopSpeed() {
    return topSpeed;
  }

  // Helper methods
  public void increaseSpeed() {
    topSpeed ++;
  }

  public void increaseEndurance() {
    endurance ++;
  }

}
