package Lesson_6;

import java.util.Map;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades;

    protected Student(String name, String group, int course, Map<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }
    public String getName(){
        return name;
    }
    public String getGroup(){
        return group;
    }
    public int getCourse(){
        return course;
    }
    public Map<String, Integer> getGrades(){
        return grades;
    }
    public void setCourse(int course){
        this.course = course;
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

