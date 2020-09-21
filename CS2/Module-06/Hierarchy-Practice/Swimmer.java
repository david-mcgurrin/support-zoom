public class Swimmer extends Athlete {

  // Private variables
  private int distance;   // Distance in metres that the swimmer specialises in
  private String stroke;  // Stroke that the swimmer specialises in
  
  // Constructor
  Swimmer(String name, int age, String club, String level, int distance, String stroke) {
    super(name, age, club, level); // Super used to get the superclass constructor
    this.distance = distance;
    this.stroke = stroke;
  }

  // Get methods
  public int getDistance() { return distance; };

  public String getStroke() { return stroke; };

  // Set methods
  public void setDistance(int distance) { 
    this.distance = distance;
  };

  public void setStroke(String stroke) { 
    this.stroke = stroke;
  };

  // Swimmer toString() method
  public String toString() {
    return super.getName() + " is a " + stroke + " stroke swimmer who is " + super.getAge() + " years old.";
  }
  
}
