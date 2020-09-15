package wearables.clothing.shirts;

public class ButtonShirt extends Shirts {

  // Variables
  private String color;
  private int size;

  // Constructor
  public ButtonShirt(String color, int size) {
    this.color = color.toLowerCase(); // The primary color of shirt
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
    return false;
  }

  public Boolean isGoodWithRunners() {
    return false;
  }

  public Boolean isGoodWithShorts() {
    return false;
  }

  // String method
  public String toString() {
    return "The button shirt is " + color + " and the size is " + size;
  }

}
