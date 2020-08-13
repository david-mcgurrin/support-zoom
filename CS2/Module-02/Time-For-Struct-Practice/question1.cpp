#include <iostream>
#include <string>

using namespace std;

// Create struct for the time
struct currentTime {
  int hours;
  int minutes;
  int seconds;
  string period;
};

// Function to change the period of day from AM to PM and vice versa
void advance12Hours(currentTime &t) {
  if (t.period == "AM") {
    t.period = "PM";
  } else if (t.period == "PM") {
    t.period = "AM";
  }
}

// Black box function to return the number of minutes remaining in the hour. Note: seconds not accounted for
int getRemainingMinutes(int minutes) {
  return 59 - minutes;
}

int main() {

  currentTime t = {7, 30, 55, "AM"};
  cout << "The time is " << t.hours << ":" << t.minutes << ":" << t.seconds << " " << t.period << "\n";

  advance12Hours(t);
  cout << "New time is " << t.hours << ":" << t.minutes << ":" << t.seconds << " " << t.period << "\n";

  int minutesRemaining = getRemainingMinutes(t.minutes);
  cout << "There are " << minutesRemaining << " minutes left in the hour\n";

  return 0;
}