#include <iostream>

using namespace std;

float getAverageScore(int scoreArray[], int ARRAY_SIZE) {

  float total = 0;

  // Same loop setup as in the main() function
  for (int i = 0; i < ARRAY_SIZE; i += 2) {

    total += scoreArray[i]; 

  }

  // Despite only 5 values being used the original array was set with a size of 10 and this is necessary to get the proper average
  return total / ARRAY_SIZE;
}


int main() {

  // Don't have the luxury of using a .length() method so need to define the array size
  const int ARRAY_SIZE = 10;

  int scores[ARRAY_SIZE];
  
  // Array incremented by 2 each time meaning the array will have empty entries
  for (int i = 0; i < ARRAY_SIZE; i += 2) {
    
    scores[i] = i;

  }

  // Outputs 2 rather than the Java 2.0 due to how float fixed-point notation works with cout. Would need to specify the use of decimal
  cout << "Average score: " << getAverageScore(scores, ARRAY_SIZE) << endl;

  return 0;
}