public class Sweater extends Shirts {

  // Constructor
  public Sweater(int size, String color) {
    super(size, color);
  }

  // Boolean methods
  @Override
  public boolean isFancy() {
    return true;
  }

  public boolean isGoodWithJeans() {
    return true;
  }

  public boolean isGoodWithBoots() {
    return false;
  }

  @Override
  public  boolean isSummery() {
    return false;
  }

}
