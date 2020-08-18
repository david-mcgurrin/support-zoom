#include <iostream>

using namespace std;

int main() {

  // Declare and initialise variables
  int hashShapeWidth = 19;
  int numRows = (hashShapeWidth + 1)/2; // The height of the hashtag shape. Formula used here to maintain the shape no matter what the width
  int verticalMidpoint = numRows/2;
  int rowOffset = 0; // Used for the starting position after the midpoint. Initialise as 0

  // Loop over the number of rows
  for (int row = 1; row <= numRows; row++) {

    /* Variables for the start and end of the sequences on each row */
    // Using the verticalMidpoint and the row we can get the variable for each row for the hashtag starting position.
    // The use of absolute values ensures this works as we move past the halfway point
    int startingPosition = verticalMidpoint - abs(verticalMidpoint - row + rowOffset);

    // Conveniently the number of hashtags per sequence matches the number attained from the startingPosition formula
    int numHashesInSequence = startingPosition;
    
    // The end of the lefthand sequence is simply the starting position and the number of hashtags in that row
    int leftHandEnd = startingPosition + numHashesInSequence;

    // The start of the righthand sequence is one plus the full shape width minus the startingPosition variable + the previous startingPosition. This formula ensures the start is two places from the previous row
    int rightHandStart = (hashShapeWidth + 1) - (startingPosition + (startingPosition - 1));

    // The end of the righthand sequence is one plus the full shape width minus the startingPosition variable. Adding the one is necessary since the rows start at 1
    int rightHandEnd = (hashShapeWidth + 1) - startingPosition;

      // Loop over the hashShapeWidth for the hashtag on each row
      for (int hashNum = 1; hashNum <= hashShapeWidth; hashNum++) {
        
        // Conditional for the main hashtag positioning. Used since the non-middle rows have spaces between hashtags
        if (row != verticalMidpoint && row != (verticalMidpoint + 1)) {

          if ((hashNum >= startingPosition && hashNum < leftHandEnd)
            || (hashNum >= rightHandStart && hashNum <= rightHandEnd)) {
            cout << "#";
          } else {
            cout << " ";
          }
          
        }
        
        else {
          // No spaces in the center so the hashtags go the whole way across
          if (hashNum >= startingPosition && hashNum <= rightHandEnd) {
            cout << "#";
          } else {
            cout << " ";
          }

          // Since there are two middle rows we need to increment this variable so that the bottom half is positioned correclty
          rowOffset = 1;
        } 
    }

    // End each row with a new line
    cout << "\n";
  }

  return 0;
}
