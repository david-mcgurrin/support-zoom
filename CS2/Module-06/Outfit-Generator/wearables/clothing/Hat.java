package wearables.clothing;

import wearables.accessories.Accessories;

public class Hat implements Accessories {

  // Variables
  private String color; // The primary color of the hat
  private String size;  // The size in text, i.e. small, medium, large
  private String type;  // The type of hat, i.e. baseball, fedora, cowboy

  // Constructor
  public Hat(String color, String size, String type) {
    this.color = color.toLowerCase();
    this.size = size.toLowerCase();
    this.type = type.toLowerCase();
  }

  // Getters
  public String getColor() {
    return color;
  }

  public String getSize() {
    return size;
  }

  public String getType() {
    return type;
  }

  // Boolean methods
  public Boolean isFancy() {
    return true;
  }

  public Boolean isCasual() {
    return true;
  }

  // String method
  public String toString() {
    return "The " + type + " is " + color + " and the size is " + size;
  }

}
