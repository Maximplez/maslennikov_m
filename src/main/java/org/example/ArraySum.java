package org.example;
class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class ArraySum {
    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // Проверка размера массива
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Недопустимый размер массива. Ожидался 4x4.");
        }

        int sum = 0;

        // Проход по всем элементам массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]); // Преобразование строки в int
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка в данных в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
        return sum; // Возвращаем сумму
    }
}