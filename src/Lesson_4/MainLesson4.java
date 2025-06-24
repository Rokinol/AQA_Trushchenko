package Lesson_4;

public class MainLesson4 {
    public static void main(String[] args) {
        //Task1
        //Создаем животных
        Cat cat1 = new Cat("Сер кис-кис");
        Cat cat2 = new Cat("Когтезавр");
        Dog dog1 = new Dog("Граф");
        Dog dog2 = new Dog("Лорд");

        System.out.println("Возможности котов:");
        cat1.run(125);
        cat2.run(201);
        cat1.swim(10);
        System.out.println("-------");
        System.out.println("Возможности собак:");
        dog1.run(325);
        dog2.run(550);
        dog1.swim(4);
        dog2.swim(14);

        //Блок с миской c котами
        System.out.println("-------");
        System.out.println("Блок работы миски и котов:");
        Bowl bowl = new Bowl(30);
        Cat[] cats = {
                new Cat("Пушок"),
                new Cat("Сир Царапка"),
                new Cat("Барсик"),
                new Cat("Мурзик")
        };
        System.out.println("Создали " + cats.length + " котов");

        //Кормим всех котов по 10 единиц еды
        System.out.println("\nКормим котов:");
        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        //Проверяем сытость котов
        System.out.println("\nПроверяем сытость:");
        for (Cat cat : cats) {
            String status;
            if (cat.isFull()) {
                status = "сыт";
            } else {
                status = "голоден";
            }
            System.out.println(cat.name + ": " + status);
        }

        //Добавляем еще еды в миску
        System.out.println("\nДобавляем еду в миску:");
        bowl.addFood(20);
        System.out.println("Теперь в миске: " + bowl.getFoodAmount() + " еды");

        //Пробуем покормить последнего кота снова
        System.out.println("\nПробуем покормить " + cats[3].name + " снова:");
        cats[3].eat(bowl, 10);
        System.out.println(cats[3].name + ": " + (cats[3].isFull() ? "сыт" : "голоден"));

        //Блок статистики
        System.out.println("\nСтатистика:");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Котов: " + Cat.getCatCount());
        System.out.println("Собак: " + Dog.getDogCount());

        //Task2
        GeometricFigures circle = new GeometricFigures.Circle(5.0, "Красный", "Черный");
        GeometricFigures rectangle = new GeometricFigures.Rectangle(4.0, 6.0, "Синий", "Белый");
        GeometricFigures triangle = new GeometricFigures.Triangle(3.0, 4.0, 5.0, "Зеленый", "Желтый");

        //Выводим информацию о фигурах
        System.out.println("Характеристики круга:");
        circle.printInfo();

        System.out.println("Характеристики прямоугольника:");
        rectangle.printInfo();

        System.out.println("Характеристики треугольника:");
        triangle.printInfo();
    }
}
