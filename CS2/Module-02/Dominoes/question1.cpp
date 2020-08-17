#include <iostream>

using namespace std;

// Create domino struct
struct domino {
  int topEnd; // The top half of the domino
  int bottomEnd; // The bottom half of the domino
  int spotSum; // The sum of the top and the bottom
};

// Function to add elements to the array
void fillArray(domino dominoes[], int ARRAY_SIZE) {
  int topEnd = 0;
  int bottomEnd = 0;
  int newValue = 1;
  int numOfCurrentSpots = 1;

  for (int i = 0; i < ARRAY_SIZE; i++) {
    
    if (i == newValue) {
      topEnd = 0; // Reset to 0
      bottomEnd++; // Increment by 1, up to and including 6
      numOfCurrentSpots++; // Tracks the number of spots on the current value
      newValue += numOfCurrentSpots; // Determines when to move to the next value
    }

    dominoes[i] = {topEnd, bottomEnd, topEnd + bottomEnd}; // Add a domino struct as an element in the array
    topEnd++;
  }
}

// Function to draw each end of the domino
void outputDominoEnd(int dots) {

  for (int i = 0; i < 3; i++) {

    cout << "|"; // Left hand domino edge

    // Since there are 6 distinct patterns a switch statement is used to draw the domino depening on the number of dots
    switch(dots) {
      case 0:
        for (int j = 0; j < 3; j++) {
          cout << " ";
        }
      break;

      case 1:
        for (int j = 0; j < 3; j++) {
          if (j == 1 && i == 1) {
            cout << "#";
          } else {
            cout << " ";
          }
        }
        break;
      
      case 2:
        for (int j = 0; j < 3; j++) {
          if ((j == 0 && i == 0) || (j == 2 && i == 2)) {
            cout << "#";
          } else {
            cout << " ";
          }
        }
        break;

      case 3:
        for (int j = 0; j < 3; j++) {
          if ((j == 0 && i == 0) || (j == 1 && i == 1) || (j == 2 && i == 2)) {
            cout << "#";
          } else {
            cout << " ";
          }
        }
        break;

      case 4:
        for (int j = 0; j < 3; j++) {
          if ((j != 1 && i != 1)) {
            cout << "#";
          } else {
            cout << " ";
          }
        }
        break;

      case 5:
        for (int j = 0; j < 3; j++) {
          if ((j == 0 && i == 0) || (j == 1 && i == 1) || (j == 2 && i == 2) || (j == 2 && i == 0) || (j == 0 && i == 2)) {
            cout << "#";
          } else {
            cout << " ";
          }
        }
        break;

      case 6:
        for (int j = 0; j < 3; j++) {
          if (j != 1) {
            cout << "#";
          } else {
            cout << " ";
          }
        }
        break;
    }

    cout << "|\n"; // Right hand domino edge. Followed by new line for the next row in the loop

  }

}

// Function to draw full dominoes in the terminal
void outputAllDominoes(domino dominoes[], int ARRAY_SIZE) {
  for (int i = 0; i < ARRAY_SIZE; i++) {

    // Style the domino with hyphens and then call the function for the top and bottom ends
    cout << " ---\n";
    outputDominoEnd(dominoes[i].topEnd);
    cout << " ---\n";
    outputDominoEnd(dominoes[i].bottomEnd);
    cout << " ---\n";
    cout << "\n\n";

  }
}

// Function to sort the dominoes in a reverse order
void reverseOrder(domino dominoes[], int ARRAY_SIZE) {
  for (int i = 0; i < ARRAY_SIZE; i++) {
    
    int spotSum = dominoes[i].spotSum;

    // Selection sort to reverse the order
    for (int j = i + 1; j < ARRAY_SIZE; j++) {

      // Check if the succeeding bottom end value is greater than the current value AND that the total number of spots on the domino is greater
      // The spot sum is necessary since there are multiple combinations that equal the same value, e.g. 1:2 and 0:3
      if (dominoes[j].bottomEnd >= dominoes[i].bottomEnd && dominoes[j].spotSum > spotSum) {

        // If the statement is true then we swap the entire struct
        domino temp = dominoes[j];
        dominoes[j] = dominoes[i];
        dominoes[i] = temp;
      }
    }
    
  }
}

int main() {

  const int ARRAY_SIZE = 28; // 28 pieces in a full domino set

  domino dominoes[ARRAY_SIZE]; // Create array of domino structs

  // Call the function which adds the dominoes to the array
  fillArray(dominoes, ARRAY_SIZE);

  // Print the full set of dominoes to the terminal

  cout << "Dominoes in ascending order\n\n";

  // Call the function to output all the dominoes
  outputAllDominoes(dominoes, ARRAY_SIZE);
 
  // Call the sort function which reverses the array order
  reverseOrder(dominoes, ARRAY_SIZE);

  cout << "Dominoes in descending order\n\n";

  // Call the function to output all the dominoes. This time in a descending order
  outputAllDominoes(dominoes, ARRAY_SIZE);

  return 0;
}