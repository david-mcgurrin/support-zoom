public class Slacks extends Pants {

  // Constructor
  public Slacks(int size, String color) {
    super(size, color);
  }

  // Boolean method
  @Override
  public boolean isCasual() {
    return false;
  }

  @Override
  public boolean isFancy() {
    return true;
  }

  @Override
  public  boolean isSummery() {
    return false;
  }
  
  public boolean isGoodWithBoots() {
    return false;
  }

}
