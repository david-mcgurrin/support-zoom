#include <iostream>

using namespace std;

bool isSorted(int array[], int numItems) {
  
  for (int i = 0; i < numItems - 1; i++) {

    // If the current value is greater than the next value then the array is not in ascending order so we exit out of the loop by returning false
    if (array[i] > array[i + 1]) {
      return false;
    }

  }
  return true;
}

int main() {
  const int TEST_ARRAY_1_SIZE = 9;
  int testArray1[TEST_ARRAY_1_SIZE] = {1, 2, 2, 3, 1, 5, 6, 7, 10};

  cout << "isSorted returned " << isSorted(testArray1, TEST_ARRAY_1_SIZE) << endl;

  return 0;
}

