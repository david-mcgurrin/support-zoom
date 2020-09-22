public abstract class Shirts extends Clothing {

  public Shirts(int size, String color) {
    super(size, color);
  }

  // Declare abstract methods
  public abstract boolean isGoodWithJeans();

  public abstract boolean isGoodWithBoots();
 
}
