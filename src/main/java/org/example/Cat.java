package org.example;

public class Cat extends Animal {
    private boolean isFull;
    private static int foodBowl = 0;

    public Cat() {
        super();
        isFull = false; // Изначально кот голоден
    }

    public void eat(int food) {
        if (food > foodBowl) {
            System.out.println("Кот не может поесть, недостаточно еды.");
        } else {
            foodBowl -= food;
            isFull = true; // Кот становится сытым
            System.out.println("Кот поел и стал сыт.");
        }
    }

    public static void addFood(int food) {
        foodBowl += food;
        System.out.println("В миску добавлено " + food + " еды.");
    }

    public void checkSatiety() {
        System.out.println("Сытость кота: " + (isFull ? "Сыт" : "Голоден"));
    }
}