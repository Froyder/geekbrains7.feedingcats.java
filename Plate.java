package ru.geek.homeworks.lesson7.feedingCats;

public class Plate {

        int foodInPlate; // текущее количество еды в тарелке
        int capacity;    // максимальное количество еды в тарелке

        //конструктор для тарелки
        public Plate (int food, int capacity) {
            this.foodInPlate = food;
            this.capacity = capacity;
        }

        //учитываем количество съеденной еды и сообщаем, если ее недостаточно
        public void decreaseFood(int appetite) {
            if (foodInPlate > appetite) {
                foodInPlate -= appetite;
            }
        }

        // выводим информация об оставшемся количестве еды в тарелке
        public void plateInfo () {
            System.out.println("В тарелке осталось " + foodInPlate + " еды.");
        }

        // восполняет запас еды в тарелке до максимума
        public void refillPlate () {
            foodInPlate += (capacity - foodInPlate);
            System.out.println("Тарелка наполнена доверху! Теперь в ней " + foodInPlate + " еды.");
        }

        // восполняет количество еды на конкретное число с учетом максимальной вместимости тарелки
        public void addFood (int add) {
            if (foodInPlate + add <= capacity) {
                foodInPlate += add;
                System.out.println("Добавили в тарелку " + add + " граммов корма. Теперь в ней " + foodInPlate + " еды.");
            } else System.out.println ("Сейчас в тарелку можно добавить только " + (capacity - foodInPlate) + " единиц еды.");
        }
}
