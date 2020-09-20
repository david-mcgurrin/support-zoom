public class TestClass {

  public static void main(String[] args) {

    // Create hat and item objects
    LegoHat hat  = new LegoHat("Fedora", 5);
    
    LegoItem leftHand = new LegoItem("Sword", 10);
    
    LegoItem rightHand = new LegoItem("fishing rod", 5.5f);


    // Create minifigure objects
    LegoMinifigure legoPerson1 = new LegoMinifigure("Jimmy", hat, leftHand, rightHand);  // Object using the full constructor

    LegoMinifigure legoPerson2 = new LegoMinifigure("Timothy"); // Object using just the name

    LegoMinifigure legoPerson3 = new LegoMinifigure("Kimberly", leftHand); // Object using the name and one item

    LegoMinifigure legoPerson4 = new LegoMinifigure("Ledly", hat, leftHand); // Object using the name, hat and one item


    // Initial output

    System.out.println("--- Initial Objects ---");

    System.out.println(legoPerson1.toString());

    System.out.println(legoPerson2.toString());

    System.out.println(legoPerson3.toString());

    System.out.println(legoPerson4.toString());

    System.out.println("");
    
    System.out.println("");


    // Call some methods

    legoPerson1.wearHat(new LegoHat("Top Hat", 20));

    legoPerson2.wearHat(new LegoHat("baseball cap", 8));

    legoPerson2.placeInLeftHand(new LegoItem("bottle", 2));
    
    legoPerson2.swapHands();

    legoPerson3.swapHands();

    // Print the output

    System.out.println("--- Modified Objects ---");

    System.out.println(legoPerson1.isGood("winter", 5));

    System.out.println(legoPerson1.toString());

    System.out.println(legoPerson2.toString());

    System.out.println(legoPerson3.toString());

    System.out.println("");
    
    System.out.println("");


    // Call more methods

    System.out.println("--- Modified Objects ---");

    legoPerson1.wearHat(new LegoHat("Top Hat", 8));
    
    legoPerson1.swapHands();

    legoPerson2.placeInRightHand(new LegoItem("bottle", 6));

    legoPerson3.placeInRightHand(new LegoItem("gun", 5));

    // Print the output

    System.out.println(legoPerson1.toString());

    System.out.println(legoPerson2.toString());

    System.out.println(legoPerson3.toString());

    System.out.println("");
    
    System.out.println("");


    // Check if good
    boolean person1Good = legoPerson1.isGood("winter", 20);

    if (person1Good) {
      System.out.println(legoPerson1.name + " is good!");
    } else {
      System.out.println(legoPerson1.name + " is not so good! Get a more stylish hat and less heavy items!");
    }

    boolean person2Good = legoPerson2.isGood("winter", 10);

    if (person2Good) {
      System.out.println(legoPerson2.name + " is good!");
    } else {
      System.out.println(legoPerson2.name + " is not so good! Get a more stylish hat and less heavy items!");
    }
    
  }
  
}