import java.util.List;
import java.util.ArrayList;

public class Pig {

    /*
    * Create a method "pigLatin" that takes a string consisting of one or more 
    * all-lowercase words separated by spaces. It should return a new string 
    * converted to "pig Latin," where each word has its first letter moved to 
    * the back and the letters "ay" are added to the end of the word. However, 
    * words starting with a vowel (a, e, i, o, or u) should not be altered.
    *
    * Examples:
    *
    * pigLatin("something")  should return "omethingsay"
    * pigLatin("awesome")    should return "awesome" (words starting with a vowel should not be altered)
    * pigLatin("latin is a hard language")  should return "atinlay is a ardhay anguagelay"
    * pigLatin("y")  should return "yay"
    * pigLatin("e")   should return "e"
    */
    public static void main(String[] args) {
        // Test cases
        assertEqual(1, pigLatin("something"), "omethingsay");
        assertEqual(2, pigLatin("awesome"), "awesome");
        assertEqual(3, pigLatin("latin is a hard language"), "atinlay is a ardhay anguagelay");
        assertEqual(4, pigLatin("y"), "yay");
        assertEqual(5, pigLatin("e"), "e");
    }

    // Implement your solution here!
    public static String pigLatin(String sentence) {
        // empty array list
        List<String> words = new ArrayList<>();
        // vowel list: (a, e, i, o, or u)
        String vowels = "aeiou";
        // create a string list with the words in it
        String[] sentenceWords = sentence.split(" ");
        for (String word : sentenceWords) {
            // variable word: grab the whole word
            String processedWord = word;
            // variable firstletter: grab the first letter in the string store it in a variable
            char firstLetter = word.charAt(0);
            // if the first letter does not contains a vowel
            if (!vowels.contains(String.valueOf(firstLetter))) {
                // update word: trim the word by removing the first letter and keeping the rest + "ay" at the end;
                processedWord = word.substring(1) + firstLetter + "ay";
            }
            // else if it does contain a vowel
            // do nothing (word remains unchanged)

            // add word variable into the arraylist;
            words.add(processedWord);
        }
        // EX: String.join(" and ", list);
        // return arraylist.join(" ");
        return String.join(" ", words);
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
  
  