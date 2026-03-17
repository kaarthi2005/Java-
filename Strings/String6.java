import java.util.*;


public class String6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        text = text.toLowerCase();

        text = text.replaceAll("[^a-z0-9\\s]", " ");

        String[] words = text.trim().split("\\s+");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        List<String> sortedWords = new ArrayList<>(wordCount.keySet());
        Collections.sort(sortedWords);

        System.out.println("Word Frequency Report:");
        for (String word : sortedWords) {
            System.out.println(word + ": " + wordCount.get(word));
        }

        System.out.println("Total Unique Words: " + wordCount.size());

        scanner.close();
    }
}    

