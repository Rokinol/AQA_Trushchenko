package Lesson_4.Animals;

import Lesson_4.Animal;
import Lesson_4.Bowl;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name, 200, 0);
        catCount++;
        this.isFull = false;
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            this.isFull = true;
            System.out.println(name + " поел, теперь сыт");
        } else {
            System.out.println(name + " не наелся, мало еды");
        }
    }

    //Проверка сытости Cat
    public boolean isFull() {
        return isFull;
    }

    //Счетчик Cat
    public static int getCatCount() {
        return catCount;
    }
}
