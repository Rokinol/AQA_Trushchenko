package Lesson_2;

public class MainLesson2 {
    public static void main(String[] args) {

        Lesson2Tasks.printThreeWords();//Task1

        Lesson2Tasks.checkSumSign();//Task2

        Lesson2Tasks.printColor();//Task3

        Lesson2Tasks.compareNumbers();//Task4

        System.out.println(Lesson2Tasks.sumInRangeOf(10, 11)); //false Task5
        System.out.println(Lesson2Tasks.sumInRangeOf(10, 1)); //true

        Lesson2Tasks.checkNumber(1);//Task6
        Lesson2Tasks.checkNumber(0);
        Lesson2Tasks.checkNumber(-1);

        System.out.println(Lesson2Tasks.checkNumbers(1)); //Task7
        System.out.println(Lesson2Tasks.checkNumbers(0));
        System.out.println(Lesson2Tasks.checkNumbers(-1));

        Lesson2Tasks.printStringSomeTimes(3, "Task eight");//Task8

        System.out.println(Lesson2Tasks.leapYear(2000));//Task9
        System.out.println(Lesson2Tasks.leapYear(1800));
        System.out.println(Lesson2Tasks.leapYear(2020));
        System.out.println(Lesson2Tasks.leapYear(2021));

        Lesson2Tasks.invertArray();//Task10

        Lesson2Tasks.newArray();//Task11

        Lesson2Tasks.convertArray();//Task12

        Lesson2Tasks.matrixDiagonal();//Task13

        int length = 5;//Task14
        int value = 7;
        int[] result = Lesson2Tasks.createArray(length, value);
        System.out.print("Созданный массив: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
