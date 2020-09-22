public class Fleece extends Outerwear {
  
  // Constructor
  public Fleece(int size, String color) {
    super(size, color);
  }

  // Boolean methods
  @Override
  public boolean isSummery() {
    return true;
  }

  public boolean isGoodWithShorts() {
    return true;
  }

  public boolean isGoodWithSandals() {
    return true;
  }
}
