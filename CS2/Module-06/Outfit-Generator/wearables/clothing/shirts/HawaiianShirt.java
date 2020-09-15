package wearables.clothing.shirts;

public class HawaiianShirt extends Shirts {

  // Variables
  private String color;
  private int size;

  // Constructor
  public HawaiianShirt(String color, int size) {
    this.color = color.toLowerCase(); // The primary color of the shirt
    this.size = size; // The chest size in inches
  }

  // Getters
  public String getColor() {
    return color;
  }

  public int getSize() {
    return size;
  }

  // Boolean methods
  public Boolean isColorful() {
    return true;
  }

  public Boolean isFancy() {
    return true;
  }

  public Boolean isCasual() {
    return true;
  }

  public Boolean isGoodWithHikingBoots() {
    return false;
  }

  public Boolean isGoodWithShorts() {
    return true;
  }

  // String method
  public String toString() {
    return "The Hawaiian shirt is " + color + " and the size is " + size;
  }

}
