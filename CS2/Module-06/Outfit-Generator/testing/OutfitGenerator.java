package testing;

import java.util.ArrayList;
import wearables.clothing.*;
import wearables.clothing.shirts.*;
import wearables.clothing.pants.*;
import wearables.clothing.shoes.*;
import wearables.clothing.outerwear.*;
import wearables.accessories.*;

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

    // Create variables to store the random int. This is used as the index in the ArrayList
    int randomIndexShirts = (int) Math.floor((Math.random() * shirtsArray.size()));
    int randomIndexPants = (int) Math.floor((Math.random() * pantsArray.size()));
    int randomIndexShoes = (int) Math.floor((Math.random() * shoesArray.size()));
    int randomIndexOuterwear = (int) Math.floor((Math.random() * outerwearArray.size()));
    int randomIndexAccessories = (int) Math.floor((Math.random() * accessoriesArray.size()));

    // Output the items of clothing
    System.out.println(shirtsArray.get(randomIndexShirts).toString());
    System.out.println(pantsArray.get(randomIndexPants).toString());
    System.out.println(shoesArray.get(randomIndexShoes).toString());
    System.out.println(outerwearArray.get(randomIndexOuterwear).toString());
    System.out.println(accessoriesArray.get(randomIndexAccessories).toString());

    // Return true if there is no item clash. This exits the loop in the test function
    if (!outfitClashCheck(randomIndexShirts, randomIndexPants, randomIndexShoes, randomIndexOuterwear, randomIndexAccessories)) {
      System.out.println("\n\n");
      return true;
    }

    // Otherwise return false to check again
    else {
      return false;
    }

  }

  public boolean outfitClashCheck(int r1, int r2, int r3, int r4, int r5) {

    // Check colors
    // A blue and green pants/shirt combo should not go together
    if ((shirtsArray.get(r1).getColor() == "green" && pantsArray.get(r2).getColor() == "blue")
        || (shirtsArray.get(r1).getColor() == "blue" && pantsArray.get(r2).getColor() == "green")) {
      System.out.println("BLUE AND GREEN SHOULD NEVER BE SEEN!\n\n");
      return true;
    }

    // Colorful pants should not go with plain shirt
    else if (!shirtsArray.get(r1).isColorful() && pantsArray.get(r2).isColorful()) {
      System.out.println("COLOFRUL AND PLAIN DON'T WORK WELL!\n\n");
      return true;
    }


    // Item specific
    // Check that the large outerwar doesn't match with shorts
    else if (pantsArray.get(r2).warmWeatherOnly() && !outerwearArray.get(r4).isGoodWithShorts()) {
      System.out.println("SHORTS AND LARGE JACKETS/COATS ARE A NO NO!\n\n");
      return true;
    }

    // Check for casual shirt and fancy accessories
    else if (shirtsArray.get(r5).isCasual() && accessoriesArray.get(r5).isFancy()) {
      System.out.println("FANCY ACCESSORIES DON'T GO WITH CASUAL SHIRTS!\n\n");
      return true;
    }

    
    // Default to ensuring casual and fancy don't go together
    // Check shoes and pants
    else if (((shoesArray.get(r3).isFancy() && pantsArray.get(r2).isCasual())
        && (shoesArray.get(r3).isCasual() && pantsArray.get(r2).isFancy()))
        
        // Check shirts and outerwear
        &&  ((shirtsArray.get(r1).isFancy() && outerwearArray.get(r4).isCasual())
        && (shirtsArray.get(r1).isCasual() && outerwearArray.get(r4).isFancy()))

        // Check shirts and pants
        && ((shirtsArray.get(r1).isFancy() && pantsArray.get(r2).isCasual())
        && (shirtsArray.get(r1).isCasual() && pantsArray.get(r2).isFancy())))
        
        {
      System.out.println("STYLE MISMATCH!\n\n");
      return true;
    } 

    return false;
  }

  // Method to add items to each ArrayList
  public void populateArrays() {
    shirtsArray.add(new TShirt("green", 36));
    shirtsArray.add(new ButtonShirt("grey", 36));
    shirtsArray.add(new HawaiianShirt("orange", 40));
    shirtsArray.add(new Sweater("navy", 36));
    shirtsArray.add(new Jersey("red", 38, "Liverpool"));
    shirtsArray.add(new TShirt("white", 30));
    shirtsArray.add(new ButtonShirt("white", 36));
    shirtsArray.add(new HawaiianShirt("pink", 40));
    shirtsArray.add(new Sweater("grey", 36));
    shirtsArray.add(new Jersey("green", 38, "Ireland"));

    pantsArray.add(new Trackies("navy", 32));
    pantsArray.add(new Slacks("black", 30));
    pantsArray.add(new Shorts("beige", 15));
    pantsArray.add(new Jeans("blue", 32, "bootcut"));
    pantsArray.add(new Cargo("green", 30));
    pantsArray.add(new Trackies("red", 28));
    pantsArray.add(new Slacks("grey", 30));
    pantsArray.add(new Shorts("navy", 20));
    pantsArray.add(new Jeans("black", 30, "skinny"));
    pantsArray.add(new Cargo("grey", 32));

    shoesArray.add(new Runners("white", 8));
    shoesArray.add(new FormalShoes("black", 8));
    shoesArray.add(new Sandals("beige", 8));
    shoesArray.add(new HikingBoots("brown", 8));
    shoesArray.add(new Runners("black", 8));
    shoesArray.add(new FormalShoes("brown", 8));
    shoesArray.add(new Sandals("red", 8));
    shoesArray.add(new HikingBoots("black", 8));

    outerwearArray.add(new Blazer("black", 36));
    outerwearArray.add(new Fleece("grey", 36));
    outerwearArray.add(new Raincoat("blue", 38));
    outerwearArray.add(new SnowJacket("navy", 40));
    outerwearArray.add(new Blazer("navy", 36));
    outerwearArray.add(new Fleece("red", 38));
    outerwearArray.add(new Raincoat("brown", 38));
    outerwearArray.add(new SnowJacket("black", 40));

    accessoriesArray.add(new Watch("black", "small", "smart"));
    accessoriesArray.add(new Jewellery("silver", "medium", "earring"));
    accessoriesArray.add(new Hat("black", "medium", "fedora"));
    accessoriesArray.add(new Tie("blue", "medium", "stripy"));
    accessoriesArray.add(new Watch("silver", "small", "analog"));
    accessoriesArray.add(new Jewellery("gold", "medium", "chain"));
    accessoriesArray.add(new Hat("red", "small", "baseball"));
    accessoriesArray.add(new Tie("black", "medium", "skinny"));
  }

}
