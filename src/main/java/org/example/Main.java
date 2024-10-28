package org.example;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        Dog dog = new Dog();
        dog.run(150);
        dog.swim(5);

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat.addFood(20);
        cat1.eat(15);
        cat2.eat(10);

        cat1.checkSatiety();
        cat2.checkSatiety();

        // Задание 2
        Shape circle = new Circle(5, "Red", "Black");
        circle.showDetails();

        Shape rectangle = new Rectangle(4, 6, "Blue", "Green");
        rectangle.showDetails();

        Shape triangle = new Triangle(3, 4, 5, "Yellow", "Purple");
        triangle.showDetails();
    }
}