package org.example;

import java.util.*;

public class PhoneBook {
    private Map<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public boolean add(String lastName, String phoneNumber) {
        if (phoneBook.containsKey(phoneNumber)) {
            return false;
        }
        phoneBook.put(phoneNumber, lastName);
        return true;
    }

    public List<String> get(String lastName) {
        List<String> numbers = new ArrayList<>();
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(lastName)) {
                numbers.add(entry.getKey());
            }
        }
        return numbers.isEmpty() ? Collections.emptyList() : numbers;
    }
}