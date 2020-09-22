public class Clothing extends Wearable {

  // Variables
  private int size;           // The size of the clothing in inches
  private String color;       // The primary color of the clothing
  private String className;   // The class name

  // Constructor
  public Clothing(int size, String color) {
    this.size = size;
    this.color = color.toLowerCase();
    this.className = this.getClass().getSimpleName().toLowerCase(); // Class name used for the string output
  }

  // Getters
  public int getSize() {
    return size;
  }

  public String getColor() {
    return color;
  }

  // Boolean methods with default values
  public boolean isColorful() {
    if (color != "white" && color != "black" && color != "grey") {
      return true;
    }

    return false;
  }

  public  boolean isCasual() {
    return true;
  }

  public  boolean isFancy() {
    return false;
  }

  public  boolean isSummery() {
    return true;
  }

  // String method
  public String toString() {
    return "Item: " + this.className + ". Color: " + this.color + ". Size: " + this.size;
  }
  
}
