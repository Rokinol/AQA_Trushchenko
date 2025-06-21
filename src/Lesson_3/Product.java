package Lesson_3;

import java.time.LocalDate;

public class Product {
    public String name;
    public LocalDate date;
    public String manufacturer;
    public String country;
    public double price;
    public boolean isReserved;

    public Product(String name, LocalDate date, String manufacturer, String country, int price, boolean isReserved) {
        this.name = name;
        this.date = date;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isReserved = isReserved;
    }
    public void printProductInfo(){
        System.out.println("Товар: " + name);
        System.out.println("Дата производства: " + date);
        System.out.println("Производство :" + manufacturer);
        System.out.println("Страна производитель: " + country);
        System.out.println("Цена: " + price);
        System.out.println("Бронирование: " + isReserved);
    }
}