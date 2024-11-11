package org.example;

public class ArraySum {
    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Недопустимый размер массива. Ожидается 4 строки. Получено: " + array.length);
        }

        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeException("Недопустимый размер массива. Ожидалась 4 столбца. Получено: " + row.length);
            }
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка в данных в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
        return sum;
    }
}