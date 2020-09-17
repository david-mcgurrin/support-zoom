public class DoubleFactorial {

  static int doubleFactorial(int n) {

    // Base case
    if (n < 1) {
      return 1;
    }

    // Get the last number
    int lastNumber = n;

    // Call the function to get the sum of the previous numbers
    int allButLastFactorial = doubleFactorial(n - 2); // Every second number due to double factorial

    // Return the last number multiplied by the sum of the rest
    return lastNumber * allButLastFactorial;
  }

  public static void main(String[] args) {

    int number = 4;
    System.out.println(number + "!! = " + doubleFactorial(number));  // 8

    number = 5;
    System.out.println(number + "!! = " + doubleFactorial(number));  // 15

    number = 6;
    System.out.println(number + "!! = " + doubleFactorial(number));  // 48

  }

}
