package wearables.accessories;

public class Jewellery implements Accessories {

  // Variables
  private String color; // The primary color of the jewellery
  private String size;  // The size in text, i.e. small, medium, large
  private String type;  // The type of jewellery, i.e. chain, earring, rings

  // Constructor
  public Jewellery(String color, String size, String type) {
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

  // String method
  public String toString() {
    return "The " + type + " is " + color + " and the size is " + size;
  }

}
