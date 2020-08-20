#include <iostream>
using namespace std;


/* Question 2 

Without the conditional check we get a segmentation fault, e.g."[1]    69252 segmentation fault  ./question1"
This occurs because pointerArray[2] was declared and initialised to NULL so when we try to point to this element
it doesn't point anywhere. This is actually good behaviour as it prevents us pointing to things that we shouldn't
be, i.e. memory from another program.
In summary, if the value is not being set to something meaningful it should be set to NULL.

*/

int main()
{
  int * pointerArray[4];

  pointerArray[0] = new int;
  pointerArray[1] = new int;
  pointerArray[2] = NULL;
  pointerArray[3] = new int;

  *(pointerArray[0]) = 1;
  *(pointerArray[1]) = 10;
  *(pointerArray[3]) = 50;

  // Loop through the pointer array and output the value that each element is pointing to
  for (int i = 0; i < 4; i++) {

    // Since NULL represents 0/false we can check to see if the value exists and if that's the case we output to the terminal
    if (pointerArray[i]) {
      cout << *pointerArray[i] << endl;
    }
  }

  // Loop through the array and deallocate the memory for any non-NULL values. Then set the value to NULL
  for (int i = 0; i < 4; i++) {
    if (pointerArray[i]) {
      delete pointerArray[i];
      pointerArray[i] = NULL;
    }
  }

  return 0;
}