package org.example;

public class Main {
    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidSizeArray = {
                {"1", "2"},
                {"3", "4"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "six", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidStructureArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12", "123"}, // Это теперь вызовет исключение
                {"13", "14", "15", "16"}
        };

        processArray(validArray);
        processArray(invalidSizeArray);
        processArray(invalidDataArray);
        processArray(invalidStructureArray);
    }

    private static void processArray(String[][] array) {
        try {
            int sum = ArraySum.sumArray(array);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }
}