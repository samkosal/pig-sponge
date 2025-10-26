import java.util.ArrayList;
import java.util.List;

public class Sponge {

  /*
   * Create a method "spongeCase" that takes a string consisting of one or more words 
   * separated by spaces. It should return a new string converted to "sponge 
   * case," where each word starts with a lowercase letter, and then alternates 
   * between upper and lower case for each following letter in the word.
   *
   * Examples:
   *
   * spongeCase("spongebob")  should return "sPoNgEbOb"
   * spongeCase("Who are YOU calling A Pinhead")  should return "wHo aRe yOu cAlLiNg a pInHeAd"
   * spongeCase("WHAT is UP my dude")  should return "wHaT iS uP mY dUdE"
   * spongeCase("debí tirar más fotos") should return dEbÍ tIrAr mÁs fOtOs" (note the accents)
   * spongeCase("E")  should return "e"
   * spongeCase("e")  should return "e"
   * 
   * Hints:
   * There exist the following methods in java:
   * Character.toUpperCase() (e.g. Character.toUpperCase('f'))
   * Character.toLowerCase() (e.g. Character.toLowerCase('Q'))
   * .toCharArray() String method (e.g. myString.toCharArray())
   */
  public static void main(String[] args) {
    // Test cases
    assertEqual(1, spongeCase("spongebob"), "sPoNgEbOb");
    assertEqual(2, spongeCase("Who are YOU calling A Pinhead"), "wHo aRe yOu cAlLiNg a pInHeAd");
    assertEqual(3, spongeCase("WHAT is UP my dude"), "wHaT iS uP mY dUdE");
    assertEqual(4, spongeCase("debí tirar más fotos"), "dEbÍ tIrAr mÁs fOtOs");
    assertEqual(5, spongeCase("E"), "e");
    assertEqual(6, spongeCase("e"), "e");
  }

  // Implement your solution here!
  public static String spongeCase(String sentence) {
    // lowercase the string thats being passed
    sentence = sentence.toLowerCase();
    // make a string list consisting of the lowercase word
    String[] WordList = sentence.split(" ");

    // empty list string
    List<String> NewwordList = new ArrayList<>();
    // loop over the string list for each word
    for (int i = 0; i < WordList.length; i++) {
      // empty string word: for each word 
      String Newword = "";
      // grab each word
      String grabword = WordList[i];
      //loop over the word for each char (tradiational for-loop)
      for (int j = 0; j < grabword.length(); j++) {
        // grab each char
        char grabchar = grabword.charAt(j);
        // if the int j is even: (i % 2 == 0)
        if (j % 2 == 0) {
          // add the char.lowercase into the empty string word
            Newword += Character.toLowerCase(grabchar);
        }
        // else if the int j is odd: (i % 2 != 0)
        else if (j % 2 != 0) {
          // add the char.uppcase into the empty string word
          Newword += Character.toUpperCase(grabchar);
        }
      
      }
      //add the empty string word into empty list string
      NewwordList.add(Newword);
    }
    //return the joined list string into a sentence string
    return String.join(" ", NewwordList);
  }
  


  // Method to help with testing, you do not need to read this.
  public static void assertEqual(int testNumber, String actual, String expected) {
    if (!expected.equals(actual)) {
      System.out.println("Test " + testNumber + " failed! Expected: '" + expected + "', but got: '" + actual + "'");
    } else {
      System.out.println("Test " + testNumber + " passed!");
    }
  }
}