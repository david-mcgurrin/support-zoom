public class Flower {
 
  // Declare the variables
  String color;
  int height;
  float percentWater;

  // Constructor
  public Flower(String newColor, int newHeight, float newPercentWater) {
    color = newColor;
    height = newHeight;
    percentWater = newPercentWater;
  }

  // Methods
  public void printFlower() {
    System.out.println(color + "(" + height + " cm, " + percentWater + "% water)");
  }

  public void growFlower() {
    height += 2;
    percentWater -= 0.05f;
  }

  public void waterFlower() {
    percentWater += 0.1f;
  }

}
