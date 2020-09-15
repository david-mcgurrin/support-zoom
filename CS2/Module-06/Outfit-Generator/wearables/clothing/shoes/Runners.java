package wearables.clothing.shoes;

public class Runners extends Shoes {

  // Variables
  private String color;
  private int size;

  // Constructor
  public Runners(String color, int size) {
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
    return false;
  }

  public Boolean isGoodWithJersey() {
    return true;
  }

  // String method
  public String toString() {
    return "The runners are " + color + " and the size is " + size;
  }

}