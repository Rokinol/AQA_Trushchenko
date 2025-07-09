package Lesson_3;

import java.time.LocalTime;

public class ParkWithArray {
    private class AttractionArray {
        private String name;
        private LocalTime openTime;
        private LocalTime closeTime;
        private double price;

        private AttractionArray(String name, LocalTime openTime, LocalTime closeTime, double price) {
            this.name = name;
            this.openTime = openTime;
            this.closeTime = closeTime;
            this.price = price;
        }

        private void printAttractionArrayInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время открытия: " + openTime);
            System.out.println("Время закрытия: " + closeTime);
            System.out.println("Цена: " + price);
        }
    }

    private AttractionArray[] attractionArrays;

    protected ParkWithArray(int capacity) {
        attractionArrays = new AttractionArray[capacity];
    }

    protected void addAttractionArray(String name, LocalTime openTime, LocalTime closeTime, double price) {
        for (int i = 0; i < attractionArrays.length; i++) {
            if (attractionArrays[i] == null) {
                attractionArrays[i] = new AttractionArray(name, openTime, closeTime, price);
                return;
            }
        }
        System.out.println("Нельзя добавить новый аттракцион!");
    }

    protected void printAttractionArray() {
        System.out.println("Аттракционы: ");
        for (AttractionArray attractionArray : attractionArrays) {
            if (attractionArray != null) {
                attractionArray.printAttractionArrayInfo();
            }
        }
    }
}