package org.example;

public class Cat extends Animal {
    private boolean isFull; // Поле для отслеживания сытости кота
    private static int foodBowl = 0;
    private static int instanceCount = 0; // Счетчик котов
    private int id;

    public Cat() {
        super();
        instanceCount++;
        id = instanceCount;
        isFull = false; // Изначально кот голоден
    }

    public void eat(int food) {
        if (food > foodBowl) {
            System.out.println("Кот " + id + " не может поесть, недостаточно еды.");
        } else {
            foodBowl -= food;
            isFull = true; // Кот становится сытым
            System.out.println("Кот " + id + " поел и стал сыт.");
        }
    }

    public static void addFood(int food) {
        foodBowl += food;
        System.out.println("В миску добавлено " + food + " еды.");
    }

    public void checkSatiety() {
        System.out.println("Сытость кота " + id + ": " + (isFull ? "Сыт" : "Голоден"));
    }

    public void run(int distance) {
        if (distance > 200) { // Ограничение на бег кота 200 м
            System.out.println("Кот " + id + " не может пробежать " + distance + " м, слишком далеко!");
        } else {
            System.out.println("Кот " + id + " пробежал " + distance + " м.");
        }
    }

    public void swim(int distance) {
        System.out.println("Кот " + id + " пытается проплыть " + distance + " м, но не может это сделать!");
    }
}