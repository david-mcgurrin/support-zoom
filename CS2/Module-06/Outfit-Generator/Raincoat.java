public class Raincoat extends Outerwear {
  
  // Constructor
  public Raincoat(int size, String color) {
    super(size, color);
  }

  // Boolean methods
  public boolean isGoodWithShorts() {
    return false;
  }

  public boolean isGoodWithSandals() {
    return false;
  }
}
