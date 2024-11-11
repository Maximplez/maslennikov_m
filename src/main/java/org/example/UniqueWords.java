package org.example;

import java.util.*;

public class UniqueWords {
    public static Map<String, Integer> countUniqueWords(String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }
}