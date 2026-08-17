import java.util.HashMap;
import java.util.Map;

/**
 * WordFrequencyCounter processes a text snippet, normalizes its contents,
 * tracks word frequencies using a {@link HashMap}, and identifies the most
 * frequently occurring word.
 *
 * <p>Key operations include:
 * <ul>
 *   <li>Case normalization and punctuation removal</li>
 *   <li>Efficient frequency counting with {@link Map#getOrDefault(Object, Object)}</li>
 *   <li>Iterating through entry sets to evaluate maximum values</li>
 * </ul>
 *
 */
public class WordFrequencyCounter {

    public static void main(String[] args) {
        String text = "The. quick brown fox jumps over the lazy dog. The quick brown fox is quick.";

        // Clean text: convert to lowercase and remove non-alphabetical characters
        String cleanedText = text.toLowerCase().replaceAll("[^a-zA-Z ]", "");
        String[] words = cleanedText.split(" ");

        // Populate frequency map
        Map<String, Integer> wordFreq = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
            }
        }

        // Print complete word frequencies
        System.out.println("--- Word Frequencies ---");
        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Identify the most frequent word
        String mostFrequentWord = "";
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentWord = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        // Display results
        System.out.println("\n--- Result ---");
        System.out.println("Most frequent word: " + mostFrequentWord);
        System.out.println("Frequency: " + maxFrequency);
    }
}