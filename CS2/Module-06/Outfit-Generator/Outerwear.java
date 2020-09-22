public abstract class Outerwear extends Clothing {

  public Outerwear(int size, String color) {
    super(size, color);
  }

  // Declare abstract methods
  public abstract boolean isGoodWithShorts();

  public abstract boolean isGoodWithSandals();
  
}
