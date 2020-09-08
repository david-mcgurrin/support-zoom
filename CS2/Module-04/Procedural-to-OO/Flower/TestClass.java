public class TestClass {
  
  public static void main(String[] args) {
    
    // Create the Flower object
    Flower myFlower = new Flower("purple", 10, 0.5f);

    // Call the methods
    myFlower.printFlower();

    myFlower.waterFlower();
  
    myFlower.printFlower();
  
    myFlower.growFlower();
  
    myFlower.printFlower();

  }
}
