package Lesson_6;

import java.util.HashSet;
import java.util.Set;

public class OperationsOnStudents{
    //метод дляудаления студента с низким баллом
    public static void removeStudents(Set<Student> students){
        Set<Student> remainingStudents  =  new HashSet<>();
        for (Student student : students){
            if (student.averageGrade() >= 3.0){
                remainingStudents.add(student);
            }
        }
        students.clear();
        students.addAll(remainingStudents);
    }
    //метод повышения курса
    public static void promoteStudents(Set<Student> students){
        for (Student student  : students){
            if (student.averageGrade() >= 3.0){
                student.course++;
            }
        }
    }

    //метод вывода информации о студентах
    public static void printStudents(Set<Student> students, int course){

        boolean found = false;
        System.out.println("Студенты " + course + " курса:");
        for (Student student : students){
            if (student.course == course){
                System.out.println("- " + student.name + " | Группа: " + student.group);
                found = true;
            }
        }
        if (!found){
            System.out.println("На этом курсе нет студентов");
        }
    }
}
