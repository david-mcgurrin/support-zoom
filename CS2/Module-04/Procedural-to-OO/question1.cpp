#include <iostream>
#include <string.h>

using namespace std;


class flower
{
public:
  // Declare variables
  string color;
  int height;
  float percentWater;

  // Constructor
  flower(string newColor, int newHeight, float newPercentWater) {
    color = newColor;
    height = newHeight;
    percentWater = newPercentWater;
  }

  // Functions
  void printFlower() {
     cout << color << " (" << height << " cm, "
       << percentWater << "% water)" << endl;
  }

  void growFlower() {
    height += 2;
    percentWater -= 0.05f;
  }

  void waterFlower() {
    percentWater += 0.1f;
  }

};

int main() {

  // Create an object of the class
  flower f = flower("purple", 10, 0.5f);

  f.printFlower();

  f.waterFlower();

  f.printFlower();

  f.growFlower();

  f.printFlower();

  return 0;
}