package org.example;

import java.util.List;

public class PhoneBookDemo {
    public static void demo() {
        PhoneBook phoneBook = new PhoneBook();

        boolean added;
        added = phoneBook.add("Иванов", "+7 (123) 456-78-90");
        System.out.println("Добавлено Иванов: " + added);
        added = phoneBook.add("Петров", "+7 (098) 765-43-21");
        System.out.println("Добавлено Петров: " + added);
        added = phoneBook.add("Иванов", "+7 (555) 123-45-67");
        System.out.println("Добавлено Иванов: " + added);
        added = phoneBook.add("Сидоров", "+7 (456) 789-01-23");
        System.out.println("Добавлено Сидоров: " + added);
        added = phoneBook.add("Иванов", "+7 (777) 888-99-99");
        System.out.println("Добавлено Иванов: " + added);
        added = phoneBook.add("Петров", "+7 (123) 456-78-90"); // Одинаковый номер
        System.out.println("Добавлено Петров: " + added);

        List<String> ivanovPhones = phoneBook.get("Иванов");
        System.out.println("Телефоны по фамилии Иванов: " + ivanovPhones);

        List<String> petrovPhones = phoneBook.get("Петров");
        System.out.println("Телефоны по фамилии Петров: " + petrovPhones);

        List<String> sidorovPhones = phoneBook.get("Сидоров");
        System.out.println("Телефоны по фамилии Сидоров: " + sidorovPhones);
    }
}