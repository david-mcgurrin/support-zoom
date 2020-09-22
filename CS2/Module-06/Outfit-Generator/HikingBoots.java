public class HikingBoots extends Shoes {

  // Constructor
  public HikingBoots(int size, String color) {
    super(size, color);
  }

  // Boolean method
  public Boolean isGoodForHiking() {
    return true;
  }

  // String method. Use of super to get the variable information from the super class
  public String toString() {
    return "Item: hiking boots. Color: " + super.getColor() + ". Size: " + super.getSize();
  }

}