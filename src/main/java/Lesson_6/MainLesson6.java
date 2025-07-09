package Lesson_6;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainLesson6 {
    public static void main(String[] args) {
        //Task1
        Set<Student> students = new HashSet<>();
        students.add(new Student("Иван Иванов", "A1", 1, Map.of("Химия", 4, "Биология", 3)));
        students.add(new Student("Петр Петров", "B2", 2, Map.of("Математика", 5, "Физика", 5)));
        students.add(new Student("Григорий Григорьев", "A2", 1, Map.of("Математика", 2, "Физика", 2)));
        students.add(new Student("Семен Семенов", "A1", 1, Map.of("Химия", 5, "Биология", 2)));
        students.add(new Student("Андрей Андреев", "A2", 1, Map.of("Математика", 4, "Физика", 1)));
        students.add(new Student("Николай Николаев", "B1", 2, Map.of("Химия", 3, "Биология", 4)));

        System.out.println("Исходное количество студентов: " + students.size());

        OperationsOnStudents.removeStudents(students);
        OperationsOnStudents.promoteStudents(students);

        System.out.println("\nПосле обработки:");
        System.out.println("Количество студентов: " + students.size());

        //Выбираем курс студентов
        OperationsOnStudents.printStudents(students, 2);

        System.out.println("-------------");

        //Task2
        TelephoneNumbers numbers = new TelephoneNumbers();
        numbers.add("Иванов", "1234561");
        numbers.add("Петров", "1234562");
        numbers.add("Иванов", "1234563");
        numbers.add("Семенов", "1234564");
        numbers.add("Семенов", "1234565");
        numbers.add("Григорьев", "1234566");

        System.out.println("Номера Иванова: " + numbers.get("Иванов"));
        System.out.println("Номера Петрова: " + numbers.get("Петров"));
        System.out.println("Номера Семенова: " + numbers.get("Семенов"));
        System.out.println("Номера Григорьева: " + numbers.get("Григорьев"));
    }
}
