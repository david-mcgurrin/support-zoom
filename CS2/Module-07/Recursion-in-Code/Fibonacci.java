public class Fibonacci {

  static int count = 0;

  static int fib(int n) {

    // First base case
    if (n == 0) {
      return 0;
    }
    
    // Second base case
    else if (n < 1) {
      return 1;
    }

    int x = fib(n - 1); // Get n - 1
    int y = fib(n - 2); // Get n - 2

    // Return the recursive case by adding the two previous values
    return x + y;
  }

  public static void main(String[] args) {

    int number = 5;

    System.out.println("The Fibonacci number when n = " + number + " is " + fib(number));  // 5

    number = 6;

    System.out.println("The Fibonacci number when n = " + number + " is " + fib(number));  // 8

    number = 10;

    System.out.println("The Fibonacci number when n = " + number + " is " + fib(number));  // 55

  }

}