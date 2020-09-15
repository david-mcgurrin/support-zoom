package wearables.clothing;

import wearables.accessories.Accessories;

public class Tie implements Accessories {

  // Variables
  private String color; // The primary color of the jewellery
  private String size;  // The size in text, i.e. small, medium, large
  private String type;  // The type of tie, i.e. skinny, thick, stripy

  // Constructor
  public Tie(String color, String size, String type) {
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
    return false;
  }

  public Boolean isJewellery() {
    return false;
  }

  public Boolean isTie() {
    return true;
  }

  // String method
  public String toString() {
    return "The " + type + " tie is " + color + " and the size is " + size;
  }

}
