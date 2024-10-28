package org.example;

public class Dog extends Animal {
    public Dog() {
        super();
    }

    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println("Собака не может пробежать такую дистанцию!");
        }
    }

    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака проплыла " + distance + " м.");
        } else {
            System.out.println("Собака не может проплыть такую дистанцию!");
        }
    }
}