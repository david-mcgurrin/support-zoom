import java.util.ArrayList;

public class OutfitGenerator {

  // Declare ArrayList variables
  ArrayList<Shirts> shirtsArray;
  ArrayList<Pants> pantsArray;
  ArrayList<Shoes> shoesArray;
  ArrayList<Outerwear> outerwearArray;
  ArrayList<Accessories> accessoriesArray;

  // Consructor to initialise the ArrayLists
  OutfitGenerator() {
    shirtsArray = new ArrayList<Shirts>();
    pantsArray = new ArrayList<Pants>();
    shoesArray = new ArrayList<Shoes>();
    outerwearArray = new ArrayList<Outerwear>();
    accessoriesArray = new ArrayList<Accessories>();
  }

  // Method to get an appropriate outfit from the generator
  public Boolean checkStyle() {

    // Create variables to store the random int. This is used as the index in the
    // ArrayList
    int randomIndexShirts = (int) Math.floor((Math.random() * shirtsArray.size()));
    int randomIndexPants = (int) Math.floor((Math.random() * pantsArray.size()));
    int randomIndexShoes = (int) Math.floor((Math.random() * shoesArray.size()));
    int randomIndexOuterwear = (int) Math.floor((Math.random() * outerwearArray.size()));
    int randomIndexAccessories = (int) Math.floor((Math.random() * accessoriesArray.size()));

    Shirts shirt = shirtsArray.get(randomIndexShirts);
    Pants pants = pantsArray.get(randomIndexPants);
    Shoes shoes = shoesArray.get(randomIndexShoes);
    Outerwear outerwear = outerwearArray.get(randomIndexOuterwear);
    Accessories accessories = accessoriesArray.get(randomIndexAccessories);

    // Output the items of clothing
    System.out.println(shirt.toString());
    System.out.println(pants.toString());
    System.out.println(shoes.toString());
    System.out.println(outerwear.toString());
    System.out.println(accessories.toString());
    System.out.println("");

    // Return true if we find a particularly good match
    if (outfitMatchCheck(shirt, pants, shoes, outerwear, accessories)) {
      return true;
    }

    // Return true if there is no item clash.
    // This exits the loop in the test function with an acceptable outfit
    else if (!outfitClashCheck(shirt, pants, shoes, outerwear, accessories)) {
      System.out.println("\n\n");
      return true;
    }

    // Otherwise no good outfit generated. Return false to check again
    else {
      return false;
    }

  }

  // Method that checks for the best outfit matches
  public boolean outfitMatchCheck(Shirts shirt, Pants pants, Shoes shoes, Outerwear outerwear,
      Accessories accessories) {

    if (shirt.isFancy() && pants.isFancy() && shoes.isFancy()) {
      System.out.println("FORMIDABLE FORMAL ATTIRE FOUND!");
      return true;
    }

    else if (shirt.isColorful() && pants.isSummery() && shoes.isSummery() && !shoes.isGoodForHiking()) {
      System.out.println("CASUAL SUMMER OUTFIT SORTED!");
      return true;
    }

    else if (shirt.isGoodWithBoots() && pants.isGoodWithBoots() && shoes.isGoodForHiking() && !accessories.isJewellery()) {
      System.out.println("PERFECT CLOBBER FOR THE OUTDOORS!");
      return true;
    }

    return false;
  }

  // Method that checks for the bad outfit matches
  public boolean outfitClashCheck(Shirts shirt, Pants pants, Shoes shoes, Outerwear outerwear,
      Accessories accessories) {

    // Check colors
    // A blue and green pants/shirt combo should not go together
    if ((shirt.getColor() == "green" && pants.getColor() == "blue")
        || (shirt.getColor() == "blue" && pants.getColor() == "green")) {
      System.out.println("BLUE AND GREEN SHOULD NEVER BE SEEN!\n\n");
      return true;
    }

    // Colorful pants should not go with plain shirt
    else if (!shirt.isColorful() && pants.isColorful()) {
      System.out.println("COLOFRUL AND PLAIN DON'T WORK WELL!\n\n");
      return true;
    }

    // Item specific
    // Check that the large outerwar doesn't match with shorts
    else if (pants.isSummery() && !outerwear.isGoodWithShorts()) {
      System.out.println("SHORTS AND LARGE JACKETS/COATS ARE A NO NO!\n\n");
      return true;
    }

    // Check for casual shirt and fancy accessories
    else if (shirt.isCasual() && accessories.isJewellery()) {
      System.out.println("FANCY ACCESSORIES DON'T GO WITH CASUAL SHIRTS!\n\n");
      return true;
    }

    // Check for casual shirt and fancy accessories
    else if (pants.isCasual() && accessories.isTie()) {
      System.out.println("UNDER NO CIRCUMSTANCES SHOULD A TIE BE WORN WITH CASUALPANTS!\n\n");
      return true;
    }

    // Default to ensuring casual and fancy don't go together
    // Check shoes and pants
    else if ((shoes.isFancy() && pants.isCasual()) || (shoes.isCasual() && pants.isFancy())) {
      System.out.println("STYLE MISMATCH!\n\n");
      return true;
    }

    // Check shirts and shoes
    else if ((shirt.isFancy() && shoes.isCasual()) || (shirt.isCasual() && shoes.isFancy())) {
      System.out.println("STYLE MISMATCH!\n\n");
      return true;
    }

    // Check shirts and pants
    else if ((shirt.isFancy() && pants.isCasual()) || (shirt.isCasual() && pants.isFancy())) {
      System.out.println("STYLE MISMATCH!\n\n");
      return true;
    }

    return false;
  }

  // Method to add items to each ArrayList
  public void populateArrays() {
    shirtsArray.add(new TShirt(36, "green", "football"));
    shirtsArray.add(new TShirt(30, "white", "plain"));
    shirtsArray.add(new TShirt(30, "white", "v-neck"));
    shirtsArray.add(new ButtonShirt(36, "black", "slim-fit"));
    shirtsArray.add(new ButtonShirt(30, "white", "regular fit"));
    shirtsArray.add(new ButtonShirt(30, "white", "hawaiian"));
    shirtsArray.add(new Sweater(36, "red"));
    shirtsArray.add(new Sweater(30, "blue"));

    pantsArray.add(new Trackies(30, "navy", "Adidas"));
    pantsArray.add(new Trackies(30, "green", "puma"));
    pantsArray.add(new Slacks(30, "black"));
    pantsArray.add(new Slacks(30, "grey"));
    pantsArray.add(new Jeans(30, "blue", "bootcut"));
    pantsArray.add(new Jeans(30, "black", "skinny"));
    pantsArray.add(new Shorts(30, "beige"));
    pantsArray.add(new Shorts(30, "green"));

    shoesArray.add(new Runners(8, "white", "Adidas"));
    shoesArray.add(new Runners(8, "blue", "Nike"));
    shoesArray.add(new DressShoes(8, "brown"));
    shoesArray.add(new DressShoes(8, "grey"));
    shoesArray.add(new HikingBoots(8, "white"));
    shoesArray.add(new HikingBoots(8, "blue"));
    shoesArray.add(new Sandals(8, "brown"));
    shoesArray.add(new Sandals(8, "black"));

    outerwearArray.add(new Raincoat(38, "red"));
    outerwearArray.add(new Raincoat(38, "yellow"));
    outerwearArray.add(new Blazer(36, "grey"));
    outerwearArray.add(new Blazer(36, "blue"));
    outerwearArray.add(new SkiJacket(38, "red"));
    outerwearArray.add(new SkiJacket(38, "white"));
    outerwearArray.add(new Fleece(36, "grey"));
    outerwearArray.add(new Fleece(36, "navy"));

    accessoriesArray.add(new Hat(10, "black", "snapback"));
    accessoriesArray.add(new Hat(10, "yellow", "baseball"));
    accessoriesArray.add(new Tie(20, "grey", "stripey"));
    accessoriesArray.add(new Tie(20, "blue", "skinny"));
    accessoriesArray.add(new Watch(38, "silver", "analog"));
    accessoriesArray.add(new Watch(38, "black", "smart"));
    accessoriesArray.add(new Jewellery(36, "gold", "earring"));
    accessoriesArray.add(new Jewellery(36, "silver", "chain"));
  }

}
