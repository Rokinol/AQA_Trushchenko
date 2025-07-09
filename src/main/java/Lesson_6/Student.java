package Lesson_6;

import java.util.Map;

public class Student {
    protected String name;
    protected String group;
    protected int course;
    protected Map<String, Integer> grades;

    protected Student(String name, String group, int course, Map<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    //метод подсчета среднего балла
    protected double averageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades.values()) {
            sum = sum + grade;
        }
        return (double) sum / grades.size();
    }
}

