public class LegoHat {

  String style;
  int size;

  public LegoHat(String style, int size) {
    this.style = style.toLowerCase();
    this.size = size;
  }
  
  public String toString() {

    String sizeString = "";

    // Out put a different string size depending on the integer passed in
    if (size >= 0 && size < 3) {
      sizeString = "small";
    } else if ( size >= 3 && size < 7) {
      sizeString = "medium";
    } else if (size >= 7 && size <= 10) {
      sizeString = "large";
    } else {
      return "an ill-fitting " + style;
    }
    
    return "a " + sizeString + " " + style;
  }

  public int computeStyle(String season) {
    
    int styleScore = 0;

    // Set to lower case as a means of error prevention
    season = season.toLowerCase();

    // Use a switch statement for the various style of hat
    switch(style) {

      case ("baseball"):

        // Inside each case is an if/else block to determine the style score
        if (season == "spring") {
          styleScore = 7;
        } else if (season == "summer") {
          styleScore = 8;
        }  else if (season == "autumn") {
          styleScore = 5;
        }  else if (season == "winter") {
          styleScore = 2;
        }
        break;

      case ("beanie"):

        if (season == "spring") {
          styleScore = 8;
        } else if (season == "summer") {
          styleScore = 3;
        }  else if (season == "autumn") {
          styleScore = 7;
        }  else if (season == "winter") {
          styleScore = 9;
        }
        break;

      case ("flat cap"):

        if (season == "spring") {
          styleScore = 6;
        } else if (season == "summer") {
          styleScore = 7;
        }  else if (season == "autumn") {
          styleScore = 4;
        }  else if (season == "winter") {
          styleScore = 2;
        }
        break;

      case ("fedora"):

        if (season == "spring") {
          styleScore = 3;
        } else if (season == "summer") {
          styleScore = 2;
        }  else if (season == "autumn") {
          styleScore = 4;
        }  else if (season == "winter") {
          styleScore = 6;
        }
        break;
      
      case ("top hat"):

        if (season == "spring") {
          styleScore = 10;
        } else if (season == "summer") {
          styleScore = 10;
        }  else if (season == "autumn") {
          styleScore = 10;
        }  else if (season == "winter") {
          styleScore = 10;
        }
        break;
    }

    return styleScore;
  }
}