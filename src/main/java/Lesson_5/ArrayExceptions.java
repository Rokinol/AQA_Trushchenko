package Lesson_5;

import Lesson_5.exceptions.MyArrayDataException;
import Lesson_5.exceptions.MyArraySizeException;

public class ArrayExceptions {

    protected static int arrayOperations(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("В массиве должно быть 4 строки!");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Строка " + i + " содержит " + array[i].length + " элемента(ов) вместо 4");
            }
        }
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }
        return sum;
    }

    protected static void printIndexOutOfBounds() {
        System.out.println("\nДемонстрация ArrayIndexOutOfBoundsException:");
        try {
            String[][] array = new String[4][4];
            String element = array[4][4];  // Намеренная ошибка
            System.out.println(element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: " + e);
            System.out.println("Сообщение: " + e.getMessage());
            System.out.println("Стек вызовов:");
            e.printStackTrace();
        }
    }
}

