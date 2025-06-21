package Lesson_3;

import java.time.LocalTime;

public class ParkWithArray {
    public class AttractionArray {
        public String name;
        public LocalTime openTime;
        public LocalTime closeTime;
        public double price;

        public AttractionArray(String name, LocalTime openTime, LocalTime closeTime, double price) {
            this.name = name;
            this.openTime = openTime;
            this.closeTime = closeTime;
            this.price = price;
        }

        public void printAttractionArrayInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время открытия: " + openTime);
            System.out.println("Время закрытия: " + closeTime);
            System.out.println("Цена: " + price);
        }
    }

    public AttractionArray[] attractionArrays;

    public ParkWithArray(int capacity) {
        attractionArrays = new AttractionArray[capacity];
    }

    public void addAttractionArray(String name, LocalTime openTime, LocalTime closeTime, double price) {
        for (int i = 0; i < attractionArrays.length; i++) {
            if (attractionArrays[i] == null) {
                attractionArrays[i] = new AttractionArray(name, openTime, closeTime, price);
                return;
            }
        }
        System.out.println("Нельзя добавить новый аттракцион!");
    }

    public void printAttractionArray() {
        System.out.println("Аттракционы: ");
        for (AttractionArray attractionArray : attractionArrays) {
            if (attractionArray != null) {
                attractionArray.printAttractionArrayInfo();
            }
        }
    }
}