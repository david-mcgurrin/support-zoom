public class TShirt extends Shirts {

  // Decalre variable
  private String type;
  
  // Constructor
  public TShirt(int size, String color, String type) {
    super(size, color);
    this.type = type.toLowerCase();
  }

  // Getter
  public String getType() {
    return type;
  }

  // Boolean methods
  public boolean isGoodWithJeans() {
    return true;
  }

  public boolean isGoodWithBoots() {
    return false;
  }

  // String method. Use of super to get the variable information from the super class
  public String toString() {
    return "Item: " + type + " t-shirt. Color: " + super.getColor() + ". Size: " + super.getSize();
  }


}
