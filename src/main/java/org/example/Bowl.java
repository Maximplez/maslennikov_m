package org.example;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food > 0 ? food : 0;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("В миску добавлено " + amount + " единиц еды.");
        }
    }

    public void decreaseFood(int amount) {
        if (amount > 0 && food >= amount) {
            food -= amount;
        } else {
            System.out.println("Недостаточно еды в миске.");
        }
    }

    public int getFood() {
        return food;
    }
}