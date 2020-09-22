public class Tie extends Accessories {
  
  // Constructor
  public Tie(int size, String color, String type) {
    super(size, color, type);
  }
  
  // Boolean method
  @Override
  public Boolean isTie() {
    return true;
  }

}