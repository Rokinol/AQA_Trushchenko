package Lesson_3;

import java.time.LocalDate;
import java.time.LocalTime;

public class MainLesson3 {
    public static void main(String[] args) {

        //Task1.1
        Product product = new Product("Test product", LocalDate.of(2025, 6, 19), "Test Fabric", "Belarus", 100, true);
        product.printProductInfo();
        System.out.println("-----");

        //Task1.2
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", LocalDate.of(2025, 1, 2), "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 16 Pro", LocalDate.of(2024, 9, 15), "Apple Inc.", "USA", 6499, false);
        productsArray[2] = new Product("Xiaomi 14", LocalDate.of(2024, 3, 1), "Xiaomi", "China", 3999, true);
        productsArray[3] = new Product("Pixel 8 Pro", LocalDate.of(2023, 10, 12), "Google", "USA", 4599, false);
        productsArray[4] = new Product("Nothing Phone 3", LocalDate.of(2024, 7, 20), "Nothing", "UK", 3499, true);
        for (Product product1 : productsArray) {
            product1.printProductInfo();
            System.out.println("-----");
        }

        //Task1.3
        Park park = new Park();
        park.createAttraction("Америкаснкие горки", LocalTime.of(9, 0), LocalTime.of(20, 0), 15);
        System.out.println("-----");
        park.createAttraction("Комната страха", LocalTime.of(12, 0), LocalTime.of(22, 0), 5);
        System.out.println("-----");
        park.createAttraction("Колесо обозрения", LocalTime.of(10, 0), LocalTime.of(19, 0), 12.5);
        System.out.println("-----");
        park.createAttraction("Тир", LocalTime.of(10, 0), LocalTime.of(20, 0), 5.5);
        System.out.println("-----");

        //Task1.3a Реализация через массив
        ParkWithArray parkWithArray = new ParkWithArray(5);
        parkWithArray.addAttractionArray("Америкаснкие горки", LocalTime.of(10, 0), LocalTime.of(20, 0), 123.5);
        parkWithArray.addAttractionArray("Комната страха", LocalTime.of(10, 0), LocalTime.of(20, 0), 123.5);
        parkWithArray.addAttractionArray("Колесо обозрения", LocalTime.of(10, 0), LocalTime.of(20, 0), 123.5);
        parkWithArray.addAttractionArray("Тир", LocalTime.of(10, 0), LocalTime.of(20, 0), 123.5);
        parkWithArray.addAttractionArray("Картинг", LocalTime.of(10, 0), LocalTime.of(20, 0), 123.5);
        parkWithArray.addAttractionArray("Лишний аттракцион", LocalTime.of(10, 0), LocalTime.of(20, 0), 123.5);
        parkWithArray.addAttractionArray("Лишний аттракцион", LocalTime.of(10, 0), LocalTime.of(20, 0), 123.5);
        parkWithArray.printAttractionArray();
    }
}