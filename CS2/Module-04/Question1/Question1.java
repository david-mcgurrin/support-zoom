public class Question1 {

  public static void printTapeArray(final ScotchTape[] tapeArray) {

    for (int i = 0; i < tapeArray.length; i++) {

      // Can concatenate the strings with the + operator
      System.out.println(tapeArray[i].colour + " (" +
                         tapeArray[i].length + " cm, " +
                         tapeArray[i].weight + " oz)");
    }

  }

  // This function is much the same as we still need to cast the result to an integer
  public static void stickTape(final ScotchTape tape, final float percentToUse) {

    tape.weight -= (int)(tape.weight * percentToUse);
    tape.length -= (int)(tape.length * percentToUse);
  }
  
  public static void main(final String[] args) {
  
    // We need to create each object using the 'new' keyword
    final ScotchTape tapes[] = new ScotchTape[] {
      new ScotchTape("clear", 3, 22),
      new ScotchTape("green", 1, 15),
      new ScotchTape("blue", 2, 19)
    };

    /* Alternate way to set this up below */

    // ScotchTape tapes[] = new ScotchTape[3];

    // tapes[0] = new ScotchTape("clear", 3, 22);
    // tapes[1] = new ScotchTape("green", 1, 15);
    // tapes[2] = new ScotchTape("blue", 2, 19);

    // The length method comes built in so we don't need to pass the array size into the function
    printTapeArray(tapes);

    // Tell the compiler to treat the values as floats as opposed to doubles using 'f'
    stickTape(tapes[0], 0.5f);
    stickTape(tapes[1], 0.3f);
    stickTape(tapes[2], 0.9f);

    System.out.println();

    printTapeArray(tapes);

  }
}