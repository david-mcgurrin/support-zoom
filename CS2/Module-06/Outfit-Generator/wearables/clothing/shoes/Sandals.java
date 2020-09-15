package wearables.clothing.shoes;

public class Sandals extends Shoes {

  // Variables
  private String color;
  private int size;

  // Constructor
  public Sandals(String color, int size) {
    this.color = color.toLowerCase(); // The primary color of the shoes
    this.size = size; // The UK shoe size
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

  public Boolean isGoodWithHawaiinShirt() {
    return true;
  }

  public Boolean isGoodWithJersey() {
    return false;
  }

  // String method
  public String toString() {
    return "The sandals are " + color + " and the size is " + size;
  }

}