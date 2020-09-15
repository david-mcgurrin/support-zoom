package wearables.clothing.shirts;

import wearables.Wearable;

// Create the abstract Shirts class
public abstract class Shirts extends Wearable {

  // Declare the get methods
  public abstract String getColor();

  public abstract int getSize();
  
  // Declare the boolean methods
  public abstract Boolean isColorful();
  
  public abstract Boolean isFancy();

  public abstract Boolean isCasual();

  public abstract Boolean isGoodWithHikingBoots();

  public abstract Boolean isGoodWithShorts();

}
