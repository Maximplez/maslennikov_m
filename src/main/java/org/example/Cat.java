package org.example;

public class Cat extends Animal {
    private boolean isFull;
    private static int foodBowl = 0;
    private static int instanceCount = 0;
    private int id; // Идентификатор кота

    public Cat() {
        super();
        instanceCount++;
        id = instanceCount;
        isFull = false;
    }

    public void eat(int food) {
        if (food > foodBowl) {
            System.out.println("Кот " + id + " не может поесть, недостаточно еды.");
        } else {
            foodBowl -= food;
            isFull = true;
            System.out.println("Кот " + id + " поел и стал сыт.");
        }
    }

    public static void addFood(int food) {
        foodBowl += food;
        System.out.println("В миску добавлено " + food + " еды.");
    }

    public void checkSatiety() {
        System.out.println("Сытость кота " + id + ": " + (isFull ? "Сыт" : "not true"));
    }
}