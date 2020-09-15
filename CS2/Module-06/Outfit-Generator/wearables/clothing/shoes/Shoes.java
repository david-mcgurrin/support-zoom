package wearables.clothing.shoes;

import wearables.Wearable;

// Create the abstract Shoes class
public abstract class Shoes extends Wearable {

  // Declare the get methods
  public abstract String getColor();

  public abstract int getSize();

  // Declare the boolean methods
  public abstract Boolean isColorful();

  public abstract Boolean isFancy();

  public abstract Boolean isCasual();

  public abstract Boolean isGoodWithHawaiinShirt();

  public abstract Boolean isGoodForHiking();

}
