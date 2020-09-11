public class Person {
  
  // Private variables
  private String name;
  private int age;

  // Constructor
  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Get methods
  public String getName() { return name; };

  public int getAge() { return age; };

  // Default toString() method
  public String toString() {
    return name + " is a person who is " + age + " years old.";
  }

}
