package org.example;

public class Main {
    public static void main(String[] args) {
        // Первое задание с животными
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();
        Dog dog6 = new Dog();

        // Создание котов
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

        // Подача еды
        Cat.addFood(50);
        cat1.eat(15);
        cat2.eat(10);
        cat3.eat(20);
        cat4.eat(20);
        cat5.eat(20);

        // Бег и плавание для собак
        dog1.run(200);
        dog1.swim(10);

        dog2.run(300);
        dog2.swim(15);

        dog3.run(100);
        dog3.swim(5);

        dog4.run(150);
        dog4.swim(12);

        dog5.run(600);
        dog5.swim(8);

        dog6.run(450);
        dog6.swim(20);

        // Бег и плавание для котов
        cat1.run(250);
        cat1.swim(10);

        cat2.run(50);
        cat2.swim(12);

        cat3.run(30);
        cat3.swim(5);

        cat4.run(200);
        cat4.swim(7);

        cat5.run(300);

        // Проверка сытости
        cat1.checkSatiety();
        cat2.checkSatiety();
        cat3.checkSatiety();
        cat4.checkSatiety();
        cat5.checkSatiety();

        // Задание 2
        Shape circle = new Circle(5, "Red", "Black");
        circle.showDetails();

        Shape rectangle = new Rectangle(4, 6, "Blue", "Green");
        rectangle.showDetails();

        Shape triangle = new Triangle(3, 4, 5, "Yellow", "Purple");
        triangle.showDetails();
    }
}