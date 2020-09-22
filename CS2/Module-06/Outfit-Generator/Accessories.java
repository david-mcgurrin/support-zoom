public class Accessories extends Wearable {

  // Variables
  private int size;           // The size of the accessory in inches
  private String color;       // The primary color of the accessory
  private String type;        // The type of the particular accessory
  private String className;   // The class name

  // Constructor
  public Accessories(int size, String color, String type) {
    this.size = size;
    this.color = color.toLowerCase();
    this.type = type.toLowerCase();
    this.className = this.getClass().getSimpleName().toLowerCase(); // Class name used for the string output
  }

  // Getters
  public int getSize() {
    return size;
  }

  public String getColor() {
    return color;
  }

  public String getType() {
    return type;
  }

  public String getClassname() {
    return className;
  }

  // Boolean methods with default values
  public boolean isColorful() {
    if (color != "white" && color != "black" && color != "grey" && color != "beige") {
      return true;
    }

    return false;
  }

  public boolean isCasual() {
    return false;
  }

  public boolean isFancy() {
    return true;
  }

  public boolean isSummery() {
    return true;
  }

  public Boolean isJewellery() {
    return false;
  }

  public Boolean isTie() {
    return false;
  }

  // String method
  public String toString() {
    return "Item: " + this.className + ". Color: " + this.color + ". Size: " + this.size;
  }

}
