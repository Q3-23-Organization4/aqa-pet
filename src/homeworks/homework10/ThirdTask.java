package homeworks.homework10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThirdTask {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "orange", "apple", "grape", "Orange", "Banana", "banana");

        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            int frequency = wordFrequency.getOrDefault(word, 0);
            wordFrequency.put(word, frequency + 1);
        }

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
