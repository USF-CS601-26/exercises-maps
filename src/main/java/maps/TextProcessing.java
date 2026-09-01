package maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class TextProcessing {

    /**
     *     Compute the # of occurrences for each word in the array of words
     *     @param words - an array of strings
     */
    public static void computeFrequencies(String[] words) {
        HashMap<String, Integer> counterMap = new HashMap<>();
        for (String word: words) {
            // FILL IN CODE:

        }

        // Print the map:
        // FILL IN CODE
        System.out.println(counterMap);

    }

    /**
     * Computes a map where the lengths are the keys, and the set of words that have this length is the value.
     * @param words array of strings
     */
    public static void computeLengthToWords(String[] words) {
        HashMap<Integer, HashSet<String>> lengthToWords = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            // FILL IN CODE:

        }
        // Print the map
        // FILL IN CODE:
        System.out.println(lengthToWords);

    }

    /** Groups words by their first character and prints the resulting map.
     *
     * @param words array of words
     */
    public static void computeFirstLetterToWords(String[] words) {
        HashMap<Character, HashSet<String>> firstLetterMap = new HashMap<>();
        // The key is the character and the value is the hash set of words that have this character in position 0 (the first character of the word)
        /* Example: Suppose the words are {"cat", "parrot", "crane", "fox", "panda"}
         The map may look like this:
         'c' -> {"cat", "crane"}
         'p' -> {"parrot", "panda"}
         'f' -> {"fox"}
         */
        for (String word : words) {
            if (word.isEmpty()) continue;
            char first = word.charAt(0);
            // FILL IN CODE:

        }

        // Print the map
        // FILL IN CODE:

    }

}
