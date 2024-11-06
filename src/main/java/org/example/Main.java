package org.example;

public class Main {
    public static void main(String[] args) {
        Bowl bowl = new Bowl(50);
        Dog[] dogs = new Dog[5];
        for (int i = 0; i < 5; i++) {
            dogs[i] = new Dog(i + 1);
        }

        Cat[] cats = new Cat[5];
        int[] foodNeeded = {15, 20, 10, 10, 15};
        for (int i = 0; i < 5; i++) {
            cats[i] = new Cat(i + 1, foodNeeded[i]);
        }

        int[] dogRunDistances = {450, 600, 300, 500, 700};
        int[] dogSwimDistances = {5, 15, 8, 2, 12};
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].run(dogRunDistances[i]);
            dogs[i].swim(dogSwimDistances[i]);
        }

        int[] catRunDistances = {150, 250, 200, 100, 300};
        int[] catSwimDistances = {3, 1, 2, 4, 5};

        for (int i = 0; i < cats.length; i++) {
            cats[i].run(catRunDistances[i]);
            cats[i].swim(catSwimDistances[i]);
        }

        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт?: " + cat.isFull());
        }

        System.out.println("Осталось еды в миске: " + bowl.getFood() + " единиц.");

        // Задание 2
        Shape circle = new Circle(5, "Red", "Black");
        circle.showDetails();

        Shape rectangle = new Rectangle(4, 6, "Blue", "Green");
        rectangle.showDetails();

        Shape triangle = new Triangle(3, 4, 5, "Yellow", "Purple");
        triangle.showDetails();

    }
}