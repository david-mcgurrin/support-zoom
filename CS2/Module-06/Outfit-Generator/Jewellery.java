public class Jewellery extends Accessories {
  
  // Constructor
  public Jewellery(int size, String color, String type) {
    super(size, color, type);
  }

  // Boolean method
  @Override
  public Boolean isJewellery() {
    return true;
  }

}