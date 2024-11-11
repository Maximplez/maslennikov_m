package org.example;

public class Main {
    public static void main(String[] args) {

        String[] words = {
                "яблоко", "банан", "груша", "апельсин", "банан",
                "киви", "яблоко", "банан", "виноград", "груша",
                "апельсин", "груша", "банан", "киви", "киви",
                "персик", "манго", "груша", "виноград", "груша",
                "банан", "яблоко", "клубника", "киви", "яблоко"
        };

        System.out.println("Уникальные слова и их количество:");
        UniqueWords.countUniqueWords(words).forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });
        PhoneBookDemo.demo();
    }
}