package org.example;

import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {
                "яблоко", "банан", "груша", "апельсин", "банан",
                "киви", "яблоко", "банан", "виноград", "груша",
                "апельсин", "груша", "банан", "киви", "киви",
                "персик", "манго", "груша", "виноград", "груша",
                "банан", "яблоко", "клубника", "киви", "яблоко"
        };

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова и их количество:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}