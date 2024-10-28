package org.example;

public class Dog extends Animal {
    private static int instanceCount = 0; // Счетчик собак
    private int id;

    public Dog() {
        instanceCount++;
        id = instanceCount;
    }

    public void run(int distance) {
        if (distance > 500) { // Ограничение на бег собаки 500 м
            System.out.println("Собака " + id + " не может пробежать " + distance + " м, слишком далеко!");
        } else {
            System.out.println("Собака " + id + " пробежала " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (distance > 10) { // Ограничение на плавание собаки 10 м
            System.out.println("Собака " + id + " не может проплыть " + distance + " м, слишком далеко!");
        } else {
            System.out.println("Собака " + id + " проплыла " + distance + " м.");
        }
    }
}