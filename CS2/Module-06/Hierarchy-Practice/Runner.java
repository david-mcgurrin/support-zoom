public class Runner extends Athlete{
  
  // Private variables
  Runner(String name, int age, String club) {
    super(name, age, club); // Super used to get the superclass constructor
  }

  // Runner toString() method
  public String toString() {
    return super.getName() + " is a runner who is " + super.getAge() + " years old.";
  }
}
