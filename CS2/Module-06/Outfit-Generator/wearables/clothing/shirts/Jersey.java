package wearables.clothing.shirts;

public class Jersey extends Shirts {

  // Variables
  private String color;
  private int size;
  private String team;

  // Constructor
  public Jersey(String color, int size, String team) {
    this.color = color.toLowerCase(); // The primary color of the shirt
    this.size = size; // The chest size in inches
    this.team = team.toLowerCase(); // The team the jersey represents
  }

  // Getters
  public String getColor() {
    return color;
  }

  public int getSize() {
    return size;
  }

  public String getTeam() {
    return team;
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

  public Boolean isGoodWithRunners() {
    return true;
  }

  public Boolean isGoodWithShorts() {
    return true;
  }

  // String method
  public String toString() {
    return "The " + team + " jersey is " + color + " and the size is " + size;
  }

}
