package wearables.clothing.pants;

import wearables.Wearable;

// Create the abstract Shirts class
public abstract class Pants extends Wearable {

  // Declare the get methods
  public abstract String getColor();

  public abstract int getSize();

  // Declare the boolean methods
  public abstract Boolean isColorful();

  public abstract Boolean isFancy();

  public abstract Boolean isCasual();

  public abstract Boolean isGoodWithHikingBoots();

  public abstract Boolean isGoodWithHawaiinShirt();

  public abstract Boolean isGoodWithJersey();

  public abstract Boolean warmWeatherOnly();

}
