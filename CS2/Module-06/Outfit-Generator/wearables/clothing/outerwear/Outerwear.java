package wearables.clothing.outerwear;

import wearables.Wearable;

// Create the abstract Outerwear class
public abstract class Outerwear extends Wearable {

  // Declare the get methods
  public abstract String getColor();

  public abstract int getSize();

  // Declare the boolean methods
  public abstract Boolean isColorful();
  
  public abstract Boolean isFancy();

  public abstract Boolean isCasual();

  public abstract Boolean isGoodWithShorts();

  public abstract Boolean isGoodWithSandals();

}
