public class LegoItem {

  String name;
  float weight;

  public LegoItem(String name, float weight) {
    this.name = name.toLowerCase();
    this.weight = weight;
  }

  public String toString() {
    return "a " + weight + "g " + name;
  }

  public boolean isHeavy(float threshold) {
    return weight > threshold;
  }
  
}