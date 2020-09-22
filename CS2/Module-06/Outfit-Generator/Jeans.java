public class Jeans extends Pants {

  // Decalre variable
  private String style;
  
  // Constructor
  public Jeans(int size, String color, String style) {
    super(size, color);
    this.style = style;
  }

  // Get method
  public String getStyle() {
    return style;
  }

  // Boolean method
  public boolean isGoodWithBoots() {
    return true;
  }

  // String method. Use of super to get the variable information from the super class
  public String toString() {
    return "Item: " + style + " jeans. Color: " + super.getColor() + ". Size: " + super.getSize();
  }

}
