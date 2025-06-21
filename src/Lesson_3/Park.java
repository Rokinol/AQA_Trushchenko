package Lesson_3;

import java.time.LocalTime;

public class Park {
    public class Attraction {
        public String name;
        public LocalTime openTime;
        public LocalTime closeTime;
        public double price;

        public Attraction(String name, LocalTime openTime, LocalTime closeTime, double price) {
            this.name = name;
            this.openTime = openTime;
            this.closeTime = closeTime;
            this.price = price;
        }

        public void printAttractionInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время открытия: " + openTime);
            System.out.println("Время закрытия: " + closeTime);
            System.out.println("Цена: " + price);
        }
    }

    public void createAttraction(String name, LocalTime openTime, LocalTime closeTime, double price) {
        Attraction attraction = new Attraction(name, openTime, closeTime, price);
        attraction.printAttractionInfo();
    }
}