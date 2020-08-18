#include <iostream>

using namespace std;

int main() {
  
  // Declare and initialise variables
  char character;
  int characterCounter = 0;
  int wordCount = 0;
  int startWord = 0;
  int endWord = 0;
  int wordLength = 0;
  int maxAmountOfCharacters = 0;
  int longestWord = 0;
  int vowelCount = 0;
  int mostVowelsWord = 0;
  int maxAmountOfVowels = 0;
  bool spaceFound = false;

  // Opening prompt
  cout << "Please enter a sentence: ";

  // Exit the loop when a new line appears
  while (character != '\n') {

    // Set the character variable to each entered char before the new line
    character = cin.get();

    // Check if a space or newline. This is where most of the logic lives as the space is used to distinguish between words
    if (character == ' ' || character  == '\n') {

      // Increment the word count if characterCounter is at least one and not a space character
      if (characterCounter > 0 && !spaceFound) {
        wordCount++;
      }

      // Once we hit a space we know we are at the end of the word
      endWord = characterCounter;

      // Calculate the lenght of each word
      wordLength = endWord - startWord;

      // Get the largest word and number of characters in it
      if (wordLength > maxAmountOfCharacters) {
        maxAmountOfCharacters = wordLength;
        longestWord = wordCount;
      }
      
      // Get the largest vowel word and number of characters in it
      if (vowelCount > maxAmountOfVowels) {
        maxAmountOfVowels = vowelCount;
        mostVowelsWord = wordCount;
      }

      startWord = characterCounter + 1; // Set the startword to be the first character after a space
      vowelCount = 0; // Reset the vowel characterCounter to 0
      spaceFound = true; // Update this to be true so that we don't continue counting spaces
    }

    // Case sensitve check for vowel characters
    else if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U'
      || character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
      vowelCount++; // Increment the vowel characterCounter
      spaceFound = false; //Reset the spaceFound boolean
    }

    // We've encharacterCountered any other character. Can reset the spaceFound boolean
    else {
      spaceFound = false;
    }

    // Increase the characterCounter with each iteration of the loop
    characterCounter++;
  }

  // Check if at least one non-space character was entered
  if (wordCount < 1) {
    cout << "The input contains no words! Why not try again?\n";
  }
  
  // Output text on number of words, largest word and most values
  else {

    // Check to see if 1 word is used and have a different message rather than using "word(s)"
    if (wordCount == 1) {
      cout << "The input contains 1 word.\n";
    } else {
      cout << "The input contains " << (wordCount) << " words.\n";
    }

    cout << "Word " << longestWord << " contains the most amount of characters(" << maxAmountOfCharacters << ").\n";
    cout << "Word " << mostVowelsWord << " contains the most amount of vowels(" << maxAmountOfVowels << ").\n";
  }

  // Make the log clearer
  cout << "\n\n";
}