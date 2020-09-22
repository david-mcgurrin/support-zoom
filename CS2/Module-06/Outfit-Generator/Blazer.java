public class Blazer extends Outerwear {

  // Constructor
  public Blazer(int size, String color) {
    super(size, color);
  }

  // Boolean methods
  @Override
  public boolean isCasual() {
    return false;
  }

  @Override
  public boolean isFancy() {
    return true;
  }

  public boolean isGoodWithShorts() {
    return false;
  }

  public boolean isGoodWithSandals() {
    return false;
  }

}
