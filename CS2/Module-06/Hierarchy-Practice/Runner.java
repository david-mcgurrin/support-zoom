public class Runner extends Athlete{

  // Private variables
  private int speed;        // Speed level of the runner
  private int endurance;    // Endurance level of the runner
  private String distance;  // The distance the runner specialises in
  
  // Constructor
  Runner(String name, int age, String club, String level, int speed, int endurance, String distance) {
    super(name, age, club, level); // Super used to get the superclass constructor
    this.speed = speed;
    this.endurance = endurance;
    this.distance = distance;
  }

  // Get methods
  public int getSpeed() {
    return speed;
  }

  public int getEndurance() {
    return endurance;
  }

  // Helper methods
  public void increaseSpeed() {
    System.out.println("Speed increased!");
    speed ++;
  }

  public void increaseEndurance() {
    System.out.println("Endurance increased!");
    endurance ++;
  }


  // Runner toString() method
  public String toString() {
    return super.getName() + " is a " + distance + " distance runner who is " + super.getAge() + " years old.";
  }
  
}
