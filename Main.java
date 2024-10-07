//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1.
        printThreeWords();
        System.out.println();

        // 2.
        checkSumSign();
        System.out.println();

        // 3.
        printColor();
        System.out.println();

        // 4.
        compareNumbers();
        System.out.println();

        // 5.
        System.out.println("Результат проверки суммы: " + checkSumInRange(7, 8));
        System.out.println();

        // 6.
        printPositiveOrNegative(10);
        System.out.println();

        // 7.
        System.out.println("Число -5 отрицательное: " + isNegative(-5));
        System.out.println();

        // 8.
        printStringMultipleTimes("Hello", 3);
        System.out.println();

        // 9.
        System.out.println("Год 2024 является високосным: " + isLeapYear(2024));
        System.out.println();

        // 10.
        flipArray();
        System.out.println();

        // 11.
        fillArrayWithSequence();
        System.out.println();

        // 12.
        multiplyLessThanSix();
        System.out.println();

        // 13.
        fillDiagonal();
        System.out.println();

        // 14.
        int[] createdArray = createArray(5, 10); //
        System.out.print("Созданный массив: ");
        for (int num : createdArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 1. Метод для вывода трех слов в столбец
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2. Метод для проверки знака суммы двух чисел
    public static void checkSumSign() {
        int a = 5; // любое значение
        int b = 3; // любое значение
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3. Метод для вывода цвета в зависимости от значения
    public static void printColor() {
        int value = 50; // любое значение
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4. Метод для сравнения двух чисел
    public static void compareNumbers() {
        int a = 7; // любое значение
        int b = 5; // любое значение
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5. Метод для проверки суммы двух целых чисел
    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    // 6. Метод для определения положительного или отрицательного числа
    public static void printPositiveOrNegative(int number) {
        if (number < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положительное");
        }
    }

    // 7. Метод, возвращающий true, если число отрицательное
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8. Метод для печати строки указанное количество раз
    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    // 9. Метод для проверки високосного года
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 10. Метод для замены 0 на 1 и 1 на 0 в массиве
    public static void flipArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        System.out.print("Изменённый массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // 11. Метод для заполнения массива значениями 1-100
    public static void fillArrayWithSequence() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;  // Заполнение от 1 до 100
        }
        System.out.print("Заполненный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // 12. Метод, который умножает числа меньше 6 на 2
    public static void multiplyLessThanSix() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.print("Изменённый массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // 13. Метод для заполнения диагонали единицами
    public static void fillDiagonal() {
        int n = 5; // Размер квадратного массива
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            array[i][i] = 1; // Заполнение диагонали единицами
        }
        System.out.println("Квадратный массив с единицами на диагонали:");
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // 14. Метод, принимающий на вход два аргумента и возвращающий массив
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}