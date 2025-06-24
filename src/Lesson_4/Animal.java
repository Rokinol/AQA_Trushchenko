package Lesson_4;

class Animal {
    private static int animalCount = 0;
    public String name;
    private int maxRunDistance;
    private int maxSwimDistance;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCount++;
    }

    //Метод для бега
    public void run(int distance) {
        if (maxRunDistance == 0) {
            System.out.println(name + " не умеет бегать");
        } else if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может бежать больше " + maxRunDistance + " м.");
        }
    }

    //Метод для плавания
    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " не умеет плавать");
        } else if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не мржет плыть больше " + maxSwimDistance + " м.");
        }
    }

    //Подсчет животных
    public static int getAnimalCount() {
        return animalCount;
    }
}

//Класс миска для дополнительных условий задания
class Bowl {
    public int foodAmount;

    public Bowl(int initialAmount) {
        //Подсмотрел как сделать гарантию неотрицательного количества еды
        this.foodAmount = Math.max(initialAmount, 0);
    }

    public boolean decreaseFood(int amount) {
        if (amount > 0 && foodAmount >= amount) {
            foodAmount = foodAmount - amount;
            return true;
        }
        return false;
    }

    //Метод добавления еды в миску
    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount = foodAmount + amount;
            System.out.println("Добавлено " + amount + " еды. В миске: " + foodAmount);
        }
    }

    //Метод получения текущего количества еды
    public int getFoodAmount() {
        return foodAmount;
    }
}

//Создаем класс Cat наследуя от Animal
class Cat extends Animal {
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

class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name, 500, 10);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}



