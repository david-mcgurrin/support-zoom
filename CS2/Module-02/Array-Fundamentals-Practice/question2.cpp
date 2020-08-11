#include <iostream>

using namespace std;

int main() {

  int uppercaseCount = 0;

  char alphabet[26] = { 'a', 'B', 'c', 'd', 'e', 'F', 'g', 'H', 'I', 'j', 'K', 'L', 'M', 'n', 'o', 'P', 'q', 'r', 'S', 't', 'U', 'V', 'w', 'x', 'Y', 'z' };

  for (int i = 0; i < 26; i++) {

    // If the integer representation of the array value is within this range it indicates it is uppercase
    if (int(alphabet[i]) >= 65 && int(alphabet[i]) <= 90) {
      uppercaseCount++;
    }

  }

  cout << "There are " << uppercaseCount << " uppercase characters in the array." << endl;
  
  return 0;
}