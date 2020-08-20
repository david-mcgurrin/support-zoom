#include <iostream>

using namespace std;

// Create the soda struct
struct soda
{
  int gramsOfSugar;
  float gramsOfCarbonation;
};

int main() {

  // Create a pointer array of struct pointers on the heap
  soda **sodaArray = new soda*[3];

  // Initialise the array values
  // Derefence the soda attributes using arrow notation
  sodaArray[0] = new soda;
  sodaArray[0]->gramsOfSugar = 9;
  sodaArray[0]->gramsOfCarbonation = 3.1;

  sodaArray[1] = new soda;
  sodaArray[1]->gramsOfSugar = 5;
  sodaArray[1]->gramsOfCarbonation = 3.4;

  sodaArray[2] = new soda;
  sodaArray[2]->gramsOfSugar = 0;
  sodaArray[2]->gramsOfCarbonation = 2.9;

  // Loop through the array and again use arrow notation to output the values
  for (int i = 0; i < 3; i++) {
    cout << "Soda " << i + 1 << "\nSugar: " << sodaArray[i]->gramsOfSugar << "g \nCarbonation: " << sodaArray[i]->gramsOfCarbonation << "g\n\n";
  }

  // After we have output the values we need to deallocate the memory for each of the pointers on the heap
  for (int i = 0; i < 3; i++) {
    delete sodaArray[i];
  }

  // Since the array also lives on the heap we must delete this too
  delete [] sodaArray;

  return 0;
}