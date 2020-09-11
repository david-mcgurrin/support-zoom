public class Swimmer extends Athlete {

  // Private variables
  private int distance; // Distance in metres that the swimmer specialises in
  
  // Constructor
  Swimmer(String name, int age, String club, int distance) {
    super(name, age, club); // Super used to get the superclass constructor
    this.distance = distance;
  }

  // Get method
  public int getDistance() { return distance; };

  // Swimmer toString() method
  public String toString() {
    return super.getName() + " is a swimmer who is " + super.getAge() + " years old.";
  }
  
}
