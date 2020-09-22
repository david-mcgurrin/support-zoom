public class DressShoes extends Shoes {

  // Constructor
  public DressShoes(int size, String color) {
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
  
  public Boolean isGoodForHiking() {
    return false;
  }

  // String method. Use of super to get the variable information from the super class
  public String toString() {
    return "Item: dress shoes. Color: " + super.getColor() + ". Size: " + super.getSize();
  }

}
