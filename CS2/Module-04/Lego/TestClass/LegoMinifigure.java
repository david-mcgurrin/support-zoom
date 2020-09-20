public class LegoMinifigure {

  /* Class attributes */
  String name;
  LegoHat hat;
  LegoItem leftHand;
  LegoItem rightHand;

  /* Constructors */
  // Using overloading as not each minifigure will have a hat and two items
  // Basic constructor 
  public LegoMinifigure(String name) {
    this(name, null, null, null);
  }

  // Constructor for a name and a hat
  public LegoMinifigure(String name, LegoHat hat) {
    this(name, hat, null, null);
  }

  // Constructor for a name and one item. Defaults to the left hand if only carrying one item when created
  public LegoMinifigure(String name, LegoItem leftHand) {
    this(name, null, leftHand, null);
  }

  // Constructor for a name, a hat and one item. Defaults to the left hand if only carrying one item when created
   public LegoMinifigure(String name, LegoHat hat, LegoItem leftHand) {
    this(name, hat, leftHand, null);
  }

  // Constructor for a name and two items
  public LegoMinifigure(String name, LegoItem leftHand, LegoItem rightHand) {
    this(name, null, leftHand, rightHand);
  }

  // Full constructor for the Lego minifigure
  public LegoMinifigure(String name, LegoHat hat, LegoItem leftHand, LegoItem rightHand) {
    this.name = name;
    this.hat = hat;
    this.leftHand = leftHand;
    this.rightHand = rightHand;
  }


  /* Methods */
  public String toString() {
    String hatString = "";
    String leftHandString = "";
    String rightHandString = "";

    // Set up null checks depending on what values the object has when this method runs
    if(hat != null) {
      hatString = " " + name + " is wearing " + hat.toString() + ".";
    }

    if(leftHand != null) {
      leftHandString = " " + name + " is holding a " + leftHand.toString() + " in their left hand.";
    }

    if(rightHand != null) {
      rightHandString = " In their right hand is a " + rightHand.toString() + ".";
    }

    // Return the completed string
    return "Meet " + name + "!" + hatString + leftHandString + rightHandString;
  }

  public void swapHands() {

    // Create a temporary object for the swap
    LegoItem temp = leftHand; 
    leftHand = rightHand;
    rightHand = temp;

  }

  public void wearHat(LegoHat hat) {
    this.hat = hat;
  }

  public void placeInLeftHand(LegoItem item) {
    this.leftHand = item;
  }

  public void placeInRightHand(LegoItem item) {
    this.rightHand = item;
  }

  public boolean isGood(String season, float threshold) {

    // Guard clause to immediately return false if the Lego minnifigure is not wearing a hat
    if (hat == null) {
      return false;
    }

    // Get the integer value of the style score
    int computedStyle = hat.computeStyle(season);

    // Initialise the heavy booleans to false since carrying nothing means there is no threshold to meet
    boolean isLeftHeavy = false;
    boolean isRightHeavy = false;

    // Check to see if the object has anything in either hand
    if (leftHand != null) {
      isLeftHeavy = leftHand.isHeavy(threshold);
    }

    if (rightHand != null) {
      isRightHeavy = rightHand.isHeavy(threshold);
    }

    // If the style is high enoough and neither hand is holding something heavy we return true
    if (computedStyle >= 6 && !isLeftHeavy && !isRightHeavy) {
      return true;
    }
    
    return false;
  }
}