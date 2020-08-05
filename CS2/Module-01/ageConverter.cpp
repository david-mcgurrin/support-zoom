#include <iostream> // Include this to be able to input and output

using namespace std; // Set the namespace to standard

int ageInSeconds(int currentAge); // Declare the function

int main() {
  // Declare variables
  int age, updatedAge, remainder;

  // Initialise variable
  int billion = 1000000000;

  cout << fixed; // Use fixed to avoid scientific notation

  cout << "Welcome to the Billion Birthday Calculator!" << endl;
  cout << "Please enter your age: ";

  // Check if the inputed value is an integer and within the limits
  while (!(cin >> age) || age < 0 || age > 60) {
    cout << "Age must be a number between 1 and 60.\n" << endl;
    cout << "Please enter your age: ";

    cin.clear(); // Clear the input stream
    cin.ignore(100, '\n'); // Ignore the next 100 characters until a new line. Then try enter a new value
  }

  // Call the function to get the age in seconds
  updatedAge = ageInSeconds(age);

  if (updatedAge > billion) {
    cout << "Congrats on living for at least 1 billion seconds. Only " << (billion * 2) - updatedAge << " seconds until the second billion. Way to go!" << endl;
  }
  else {
    cout << "You have at most " << (billion - updatedAge) << " seconds left to reach the big milestone. Keep it up!" << endl;
  }
  return 0;
}

/* Age in Seconds function
This acts as a black box function as you feed in your age (as an integer) and as the name suggests you get back your age in seconds */
int ageInSeconds(int currentAge) {
  return currentAge * 31536000; // Multiply current age by number of seconds in a year
}