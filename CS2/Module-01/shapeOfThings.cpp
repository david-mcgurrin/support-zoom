#include <iostream>

using namespace std;

int main() {

  // Declare and initialise variables
  int shapeWidth = 19; // The width of the hashtag shape
  int numRows = 10; // The height of the hashtag shape
  int midpoint = numRows/2; // The vertical midpoint
  int rowOffset = 0; // Initialise as 0

  // Loop over the number of rows
  for (int row = 1; row <= numRows; row++) {
    
    // Using the midpoint and the row we can get the variable for each row for the hashtag positioning
    int hashPosition = midpoint - abs(midpoint - row);

    int doubledHashPosition = 2 * hashPosition;
    int doubledRowOffset = 2 * rowOffset;

      // Loop over the shapeWidth for the hashtag on each row
      for (int hashNum = 1; hashNum <= shapeWidth; hashNum++) {
        
        // Conditional for the main hashtag positioning. Used since the non-middle rows have spaces between hashtags
        if (row != midpoint && row != (midpoint + 1)) {

          if (((hashNum >= hashPosition + rowOffset) && (hashNum < doubledHashPosition + doubledRowOffset)) // Lefthand side
            || ((hashNum >= shapeWidth - doubledHashPosition - doubledRowOffset + 2) && (hashNum < shapeWidth - hashPosition - rowOffset + 2))) { // Righthand side
            cout << "#";
          } else {
            cout << " ";
          }

        // Otherwise the middle two rows output is more straightforward as no space between the left and right sides
        } else {

          if (hashNum >= midpoint && hashNum <= shapeWidth - midpoint + 1) {
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

/* Observations */
/*
- For the top left shape the row and number of hashtags present is the same
- The start of top right shape decreases by 2 each time
- The hashPosition uses absolute value so that it can be used on both the top half and bottom half
- This variable can also be subtracted from the shapeWidth to get the position on the righthand side as well as left
- Added the rowOffset variable since row 6 affects the progression of the hashPosition variable
- Use of variables means shapeWidth and numRows can be changed and the shape will largely remain the same
*/
