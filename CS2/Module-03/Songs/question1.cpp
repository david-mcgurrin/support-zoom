#include <iostream> // For output
#include <sstream> // For stringstream

using namespace std;

// Add the song struct
struct song {
  string title;
  string artist;
  int year;
};

// Function to output the song struct as a sentence
string songToString(song *s) {

  stringstream stringStream;

  // Using arrow notation with the struct since we are pointing to it
  stringStream << s->title << " by " << s->artist << " (" << s->year << ")";

  // Use the str() function to pass back the entire string with struct attribute values inside it
  return stringStream.str();
}

// Function that creates a new array on the heap with the struct values of the supplied year
song** songsFromYear(song **songs, int size, int year, int* resultSize) {

  // Dynamically set up the array of structs on the heap
  song **songArrayForYear = new song*[*resultSize];
  
  // Keep count of the amount of matched years so that we can populate the array
  int yearCounter = 0;

  for (int i = 0; i < size; i++) {

    // If the original array has a struct value that points to the year supplied we add it to the array
    if (songs[i]->year == year) {
      songArrayForYear[yearCounter] = songs[i];
      yearCounter++;
    }

  }

  return songArrayForYear;
}

int main() {

  // Initialise the size of the array
  int ARRAY_SIZE = 5;
  
  // Create dynamic array of dynamic structs
  song **songArray = new song*[ARRAY_SIZE];

  // Fill the array with struct data on the heap
  songArray[0] = new song;
  songArray[0]->title = "Down Under";
  songArray[0]->artist = "Men At Work";
  songArray[0]->year = 1981;

  songArray[1] = new song;
  songArray[1]->title = "Kids";
  songArray[1]->artist = "MGMT";
  songArray[1]->year = 2008;

  songArray[2] = new song;
  songArray[2]->title = "Time to Pretend";
  songArray[2]->artist = "MGMT";
  songArray[2]->year = 2008;

  songArray[3] = new song;
  songArray[3]->title = "Learning to Fly";
  songArray[3]->artist = "Tom Petty";
  songArray[3]->year = 1994;

  songArray[4] = new song;
  songArray[4]->title = "Regulate";
  songArray[4]->artist = "Nate Dogg & Warren G";
  songArray[4]->year = 1994;

  // Year to search for
  int searchYear = 2008;
  
  // Set up the size of the new dynamic array
  int *resultSize; // Create the pointer
  int initialiseResultSize = 0; // Used for the initial value as derefencing as 0 set the pointer to NULL
  resultSize = &initialiseResultSize; // Set resultSize as the memory address of initialiseResultSize so the pointer is 0
  
  // Get the size of the array
  for (int i = 0; i < ARRAY_SIZE; i++) {
    if (songArray[i]->year == searchYear) {
      * resultSize += 1;
    }
  }

  // If there is a result then we call teh function and output to the terminal
  if (*resultSize > 0) {

    // Pass the pointer array, the size, the year to search for and the new array size
    song **tunes = songsFromYear(songArray, ARRAY_SIZE, searchYear, resultSize);

    // Output an opening message
    cout << searchYear << " is a classic year, which features " << *resultSize << " of your favourite tunes:" << endl;

    // Loop through this new array and output the songs
    for (int i = 0; i < *resultSize; i++) {
      cout << " - " << songToString(tunes[i]) << endl;
    }

    // Delete the dynamic tunes array
    delete [] tunes;

  } else {
    cout << "Oof, no songs from " << searchYear << " make the cut!" << endl;
  }
  
  // Deallocate the memory for the original songs array and the structs within it which were all created on the heap
  for (int i=0; i < ARRAY_SIZE; i++)
  {
    delete songArray[i];
    songArray[i] = NULL;
  }
  delete [] songArray;
  
  return 0;
}
