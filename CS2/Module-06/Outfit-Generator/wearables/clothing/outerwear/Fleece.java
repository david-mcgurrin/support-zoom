package wearables.clothing.outerwear;

public class Fleece extends Outerwear {

  // Variables
  private String color;
  private int size;

  // Constructor
  public Fleece(String color, int size) {
    this.color = color.toLowerCase(); // The primary color of outerwear
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
    return false;
  }

  public Boolean isCasual() {
    return true;
  }

  public Boolean isGoodWithShorts() {
    return true;
  }

  public Boolean isGoodWithSandals() {
    return true;
  }

  // String method
  public String toString() {
    return "The fleece is " + color + " and the size is " + size;
  }

}