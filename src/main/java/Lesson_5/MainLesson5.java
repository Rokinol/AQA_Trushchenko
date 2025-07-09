package Lesson_5;

public class MainLesson5 {
    public static void main(String[] args) {

        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "abc", "11", "12"},
                {"13", "14", "15", "123"}
        };

        String[][] wrongSizeArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        //блок с корректным массивом
        try {
            System.out.println("Сумма корректного массива: " + ArrayExceptions.arrayOperations(correctArray));
        } catch (ArrayExceptions.MyArraySizeException | ArrayExceptions.MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //блок массива с неверными данными
        try {
            System.out.println("Сумма массива с ошибкой в данных: " + ArrayExceptions.arrayOperations(invalidArray));
        } catch (ArrayExceptions.MyArraySizeException | ArrayExceptions.MyArrayDataException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

        //блок массива неверного размера
        try {
            System.out.println("Сумма массива неправильного размера: " + ArrayExceptions.arrayOperations(wrongSizeArray));
        } catch (ArrayExceptions.MyArraySizeException | ArrayExceptions.MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //ArrayIndexOutOfBoundsException
        ArrayExceptions.printIndexOutOfBounds();
    }
}
