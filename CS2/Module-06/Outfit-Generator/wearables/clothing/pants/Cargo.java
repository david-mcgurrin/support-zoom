package wearables.clothing.pants;

public class Cargo extends Pants {

  // Variables
  private String color;
  private int size;

  // Constructor
  public Cargo(String color, int size) {
    this.color = color.toLowerCase(); // The primary color of the pants
    this.size = size; // The pant length in inches
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

    if (color != "white" && color != "black" && color != "grey") {
      return true;
    }

    return false;
  }

  public Boolean isFancy() {
    return false;
  }

  public Boolean isCasual() {
    return true;
  }

  public Boolean isGoodWithHikingBoots() {
    return true;
  }

  public Boolean isGoodWithHawaiinShirt() {
    return false;
  }

  public Boolean isGoodWithJersey() {
    return false;
  }

  public Boolean warmWeatherOnly() {
    return false;
  }

  // String method
  public String toString() {
    return "The cargo pants are " + color + " and the size is " + size;
  }

}
