package wearables.clothing.shirts;

public class Sweater extends Shirts {
 
  // Variables
  private String color;
  private int size;

  // Constructor
  public Sweater(String color, int size) {
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

    if (color != "white" && color != "black" && color != "grey") {
      return true;
    }

    return false;
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
    return false;
  }

  // String method
  public String toString() {
    return "The sweater is " + color + " and the size is " + size;
  }

}
