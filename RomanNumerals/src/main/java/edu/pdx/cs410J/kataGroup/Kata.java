package edu.pdx.cs410J.kataGroup;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    
  private static final String[] onesNumerals = {"I", "V", "X"};
  private static final String[] tensNumerals = {"X", "L", "C"};
  private static final String[] hundredsNumerals = {"C", "D", "M"};

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }

  public static String getRomanNumeralFor(int number) {
    int tens = number / 10;
    int ones = number % 10;
    int fives = number % 5;

    return getString(tens, tensNumerals) + getString(ones, onesNumerals);
  }

  private static String getString(int ones, String[] numeral) {
    String romanNumeral = "";

    switch (ones) {
      case 9: romanNumeral = numeral[0] + numeral[2];
              break;
      case 8: romanNumeral += numeral[0];
      case 7: romanNumeral += numeral[0];
      case 6: romanNumeral = numeral[1] + numeral[0] + romanNumeral;
              break;
      case 4: romanNumeral += numeral[0];
      case 5: romanNumeral += numeral[1];
              break;
      case 3: romanNumeral += numeral[0];
      case 2: romanNumeral += numeral[0];
      case 1: romanNumeral += numeral[0];
              break;
      default: return "";
    }
    return romanNumeral;
  }


}