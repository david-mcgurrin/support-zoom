public class Runners extends Shoes {

  // Declare variable
  private String brand;
  
  // Constructor
  public Runners(int size, String color, String brand) {
    super(size, color);
    this.brand = brand;
  }

  // Getter
  public String getBrand() {
    return brand;
  }

  // Boolean method
  public Boolean isGoodForHiking() {
    return false;
  }

}
