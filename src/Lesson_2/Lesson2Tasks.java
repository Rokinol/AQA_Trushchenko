package Lesson_2;

public class Lesson2Tasks {
    //Task1
    public static void printThreeWords() {
        System.out.print("Orange\nBanana\nApple\n");
    }

    //Task2
    public static void checkSumSign() {
        int a = 2;
        int b = 3;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //Task3
    public static void printColor() {
        int value = 10;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    //Task4
    public static void compareNumbers() {

        int a = -2;
        int b = 23;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //Task5
    public static boolean sumInRangeOf(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    //Task6
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //Task7
    public static boolean checkNumbers(int number) {
        return number < 0;
    }

    //Task8
    public static void printStringSomeTimes(int times, String text) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

    //Task9
    public static boolean leapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    //Task10
    public static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Исходный массив: ");
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.print("Инвертированный массив: ");
        printArray(array);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    //Task11
    public static void newArray() {
        int[] numbersArray = new int[100];

        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = i + 1;
            System.out.print(numbersArray[i] + " ");
        }
        System.out.println();
    }

    //Task12
    public static void convertArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    //Task13
    public static void matrixDiagonal() {
        int size = 5;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }
        System.out.println("Матрица:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Task14
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}