public class Trackies extends Pants {

  // Decalre variable
  private String brand;
  
  // Constructor
  public Trackies(int size, String color, String brand) {
    super(size, color);
    this.brand = brand;
  }

  // Getter
  public String getBrand() {
    return brand;
  }

  // Boolean method
  public boolean isGoodWithBoots() {
    return true;
  }

}
