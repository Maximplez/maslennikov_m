package org.example;

public interface Shape {
    double calculatePerimeter();
    double calculateArea();
    String getFillColor();
    String getBorderColor();

    default void showDetails() {
        System.out.println("Периметр: " + calculatePerimeter() +
                ", Площадь: " + calculateArea() +
                ", Цвет заливки: " + getFillColor() +
                ", Цвет границ: " + getBorderColor());
    }
}