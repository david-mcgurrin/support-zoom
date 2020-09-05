#include <iostream>

using namespace std;

float getAverageScore(int scoreArray[], int ARRAY_SIZE) {

  float total = 0;

  // Same loop setup as in the main() function
  for (int i = 0; i < ARRAY_SIZE; i ++) {

    total += scoreArray[i]; 

  }

  // To get the same average result as Java we multiply the array size by 2 to get 10
  return total / (ARRAY_SIZE * 2);
}


int main() {

  // Don't have the luxury of using a .length() method so need to define the array size
  const int ARRAY_SIZE = 5; // Will only 5 variables in the array

  int scores[ARRAY_SIZE];

  int score = 0;  // Variable to add up the scores
  
  // Array incremented by 2 each time meaning the array will have empty entries
  for (int i = 0; i < ARRAY_SIZE; i ++) {
    
    scores[i] = score;  // Set the array value equal to the score

    score += 2;         // Incremeent the score by 2

  }

  // Outputs 2 rather than the scoreava 2.0 due to how float fixed-point notation works with cout. Would need to specify the use of decimal
  cout << "Average score: " << getAverageScore(scores, ARRAY_SIZE) << endl;

  return 0;
}