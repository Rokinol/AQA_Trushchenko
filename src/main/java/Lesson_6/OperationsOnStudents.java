package Lesson_6;

import java.util.HashSet;
import java.util.Set;

public class OperationsOnStudents {

    public static void removeStudents(Set<Student> students) {
        Set<Student> copy = new HashSet<>(students);
        for (Student student : copy) {
            if (student.averageGrade() < 3.0) {
                students.remove(student);
            }
        }
    }

    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.averageGrade() >= 3.0) {
                int currentCourse = student.getCourse();
                student.setCourse(currentCourse + 1);
            }
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        System.out.println("\nСтуденты " + course + " курса:");

        boolean studentsFound = false;

        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("- " + student.getName() +
                        " (Группа: " + student.getGroup() +
                        ", Средний балл: " + String.format("%.1f", student.averageGrade()) + ")");
                studentsFound = true;
            }
        }

        if (!studentsFound) {
            System.out.println("На " + course + " курсе нет студентов");
        }
    }
}
