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

    return getString(ones);
  }

  private static String getString(int ones) {
    String romanNumeral = "";
    switch (ones) {
      case 10: return "X";
      case 5: return "V";
      case 4: return "IV";
      case 3: romanNumeral += onesNumerals[0];
      case 2: romanNumeral += onesNumerals[0];
      case 1: romanNumeral += onesNumerals[0];
              break;
      default: return "";
    }
    return romanNumeral;
  }


}