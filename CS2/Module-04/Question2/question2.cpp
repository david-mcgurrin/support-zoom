#include <iostream>

using namespace std;

float getAverageScore(int scoreArray[], int ARRAY_SIZE) {

  float total = 0;

  // Same loop setup as in the main() function
  for (int i = 0; i < ARRAY_SIZE; i ++) {

    total += scoreArray[i]; 

  }

  return total / ARRAY_SIZE;
}


int main() {


  const int ARRAY_SIZE = 10; // Array size of 10

  int scores[ARRAY_SIZE] = {};  // Initialise the array. Sets every element in the array to 0

  // Array incremented by 2 each time meaning the array will have empty entries
  for (int i = 0; i < ARRAY_SIZE; i += 2) {
    
    scores[i] = i;  // Set the array element equal to the value of i

  }

  // Outputs 2 rather than the scoreava 2.0 due to how float fixed-point notation works with cout. Would need to specify the use of decimal
  cout << "Average score: " << getAverageScore(scores, ARRAY_SIZE) << endl;

  return 0;
}