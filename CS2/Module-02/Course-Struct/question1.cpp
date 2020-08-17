#include <iostream>
#include <string>


using namespace std;

// Create the course struct
struct course {
  string dept;
  int id;
  string title;
};

// Function to loop through the array of structs and return the number of courses per department
int numCoursesInDepartment(course courseArray[], int arraySize, string department) {

  int courseCount = 0;

  for (int i = 0; i < arraySize; i++) {

    // If the current department is equal to the provided department then the course counter is incremented
    if (courseArray[i].dept.compare(department) == 0) {
      courseCount++;
    }

  }

  return courseCount;
}

// Function that outputs the number of courses in the given department
void outputNumCourses(int numCourses, string deptName) {

  // Conditional statement to output a different message depending on the number
  if (numCourses > 1) {
    cout << "There are " << numCourses << " courses in the " << deptName << " department.\n";
  } else {
    cout << "There is only " << numCourses << " course in the " << deptName << " department.\n";
  }

}

// Main function
int main() {

  // Part 1
  // Create a struct for a single course
  course irish = {"LANG", 1916, "Gaeilge do Thosaitheoirí"};

  // Part 2
  // Create an array to store 10 courses
  const int ARRAY_SIZE = 10;

  course courseArray[ARRAY_SIZE] = {
    "COMP", 101, "How to turn on your computer",
    "LANG", 1916, "Gaeilge do Thosaitheoirí",
    "LANG", 1453, "Latin",
    "COMP", 1001, "CS1",
    "COMP", 1002, "CS2",
    "COMP", 1003, "Intro to Ruby",
    "ENG", 3333, "Civil Engineering",
    "ENG", 3343, "Mechanical Engineering",
    "LAW", 4040, "Corporate Law",
    "COMP", 5000, "Advanced Assembly"
  };

  // Part 3
  // Output the number of courses per department

  // String array to test different departments
  const int DEPARTMENT_ARRAY_SIZE = 3;
  string departments[DEPARTMENT_ARRAY_SIZE] = {"LAW", "COMP", "LANG"};

  // Loop through the array and call the two functions. The first will return the number of courses and the second will output to the terminal
  for (int i = 0; i < DEPARTMENT_ARRAY_SIZE; i++) {

    int numCourses = numCoursesInDepartment(courseArray, ARRAY_SIZE, departments[i]);

    outputNumCourses(numCourses, departments[i]);

  }

  return 0;
}