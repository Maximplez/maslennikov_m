package org.example;

public class Cat extends Animal {
    private static final int RUN_LIMIT = 200;
    private boolean isFull;
    private int foodNeeded;

    public Cat(int number, int foodNeeded) {
        super("Кот " + number);
        this.isFull = false;
        this.foodNeeded = foodNeeded;
    }

    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    public void swim(int distance) {
        System.out.println(name + " пытался проплыть " + distance + " м., но не умеет плавать.");
    }

    public boolean eat(Bowl bowl) {
        if (!isFull && bowl.getFood() > 0) {
            int amountEaten = Math.min(foodNeeded, bowl.getFood());
            bowl.decreaseFood(amountEaten);
            isFull = (amountEaten == foodNeeded);
            System.out.println(name + " съел " + amountEaten + " единиц еды." + (isFull ? " И наелся." : " Но не наелся."));
        } else if (isFull) {
            System.out.println(name + " уже сыт.");
        } else {
            System.out.println(name + " не может поесть, еды недостаточно.");
        }
        System.out.println("Осталось еды в миске: " + bowl.getFood() + " единиц.");
        return isFull;
    }

    public boolean isFull() {
        return isFull;
    }
}