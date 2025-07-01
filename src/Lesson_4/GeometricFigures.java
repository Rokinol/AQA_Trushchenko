package Lesson_4;

public interface GeometricFigures {
    double calculateArea();

    String getFillColor();

    String getBorderColor();

    default double calculatePerimeter() {
        return 0.0;
    }

    default void printInfo() {
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println("------");
    }
}
