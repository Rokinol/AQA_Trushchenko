package Lesson_5.exceptions;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int row, int col, String value) {
        super("Ошибка в ячейке " + row + " , " + col + " - значение: " + value);
    }
}
