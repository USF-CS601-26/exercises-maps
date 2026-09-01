package maps;

import java.util.List;

public class TextProcessingDriver {
    static void main(String[] args) {
        String[] words1 = {"cat", "dog", "cat", "fox", "cat", "dog"};
        System.out.println("Word frequencies: ");
        TextProcessing.computeFrequencies(words1);

        String[] words2 = {"apple", "apple", "cat", "dog", "axe", "crawl", "anime", "fox"};
        System.out.println("Length to words: ");
        TextProcessing.computeLengthToWords(words2);

        System.out.println("First letter to words");
        TextProcessing.computeFirstLetterToWords(words2);

    }
}
