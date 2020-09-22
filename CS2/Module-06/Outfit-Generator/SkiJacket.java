public class SkiJacket extends Outerwear {
  
  // Constructor
  public SkiJacket(int size, String color) {
    super(size, color);
  }

  // Boolean methods
  @Override
  public boolean isSummery() {
    return false;
  }

  public boolean isGoodWithShorts() {
    return false;
  }

  public boolean isGoodWithSandals() {
    return false;
  }

   // String method. Use of super to get the variable information from the super class
  public String toString() {
    return "Item: ski jacket. Color: " + super.getColor() + ". Size: " + super.getSize();
  }
}
