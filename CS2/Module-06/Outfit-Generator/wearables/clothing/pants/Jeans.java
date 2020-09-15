package wearables.clothing.pants;

public class Jeans extends Pants {

  // Variables
  private String color;
  private int size;
  private String style;

  public Jeans(String color, int size, String style) {
    this.color = color.toLowerCase(); // The primary color of the pants
    this.size = size; // The pant length in inches
    this.style = style; // The jean style
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
    return false;
  }

  public Boolean isGoodWithHawaiinShirt() {
    return false;
  }

  public Boolean isGoodWithJersey() {
    return true;
  }

  public Boolean warmWeatherOnly() {
    return false;
  }

  // String method
  public String toString() {
    return "The " + style + " jeans are " + color + " and the size is " + size;
  }

}
