public class ButtonShirt extends Shirts {

  // Decalre variable
  private String style;

  // Constructor
  public ButtonShirt(int size, String color, String style) {
    super(size, color);
    this.style = style.toLowerCase();
  }

  // Getter
  public String getStyle() {
    return style;
  }

  // Boolean methods
  @Override
  public boolean isCasual() {
    return false;
  }

  @Override
  public boolean isFancy() {
    return true;
  }

  public boolean isGoodWithJeans() {
    return true;
  }

  public boolean isGoodWithBoots() {
    return false;
  }

  // String method. Use of super to get the variable information from the super class
  public String toString() {
    return "Item: " + style + " button shirt. Color: " + super.getColor() + ". Size: " + super.getSize();
  }
  
}
