package wearables.clothing.pants;

public class Shorts extends Pants {
  
  // Variables
  private String color;
  private int size;

  // Constructor
  public Shorts(String color, int size) {
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

  public Boolean isGoodWithRunners() {
    return true;
  }

  public Boolean isGoodWithHawaiinShirt() {
    return true;
  }

  public Boolean isGoodWithJersey() {
    return true;
  }

  public Boolean warmWeatherOnly() {
    return true;
  }

  // String method
  public String toString() {
    return "The shorts are " + color + " and the size is " + size;
  }

}
