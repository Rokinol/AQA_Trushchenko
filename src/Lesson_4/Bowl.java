package Lesson_4;

public  class Bowl {
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
