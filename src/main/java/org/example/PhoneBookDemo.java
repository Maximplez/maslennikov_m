package org.example;

import java.util.*;

class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        phoneBook.putIfAbsent(lastName, new ArrayList<>());
        phoneBook.get(lastName).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, Collections.emptyList());
    }
}

public class PhoneBookDemo {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "+7 (123) 456-78-90");
        phoneBook.add("Петров", "+7 (098) 765-43-21");
        phoneBook.add("Иванов", "+7 (555) 123-45-67");
        phoneBook.add("Сидоров", "+7 (456) 789-01-23");
        phoneBook.add("Иванов", "+7 (777) 888-99-99");

        System.out.println("Телефоны по фамилии Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны по фамилии Петров: " + phoneBook.get("Петров"));
        System.out.println("Телефоны по фамилии Сидоров: " + phoneBook.get("Сидоров"));
        System.out.println("Телефоны по фамилии Смирнов: " + phoneBook.get("Смирнов"));
    }
}