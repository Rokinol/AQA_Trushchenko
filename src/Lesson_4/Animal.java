package Lesson_4;

public abstract class Animal {
    private static int animalCount = 0;
    protected String name;
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
            System.out.println(name + " не мjжет плыть больше " + maxSwimDistance + " м.");
        }
    }

    //Подсчет животных
    public static int getAnimalCount() {
        return animalCount;
    }
}


