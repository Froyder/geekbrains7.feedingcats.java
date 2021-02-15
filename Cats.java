package ru.geek.homeworks.lesson7.feedingCats;

public class Cats {

        //основные параметры класса Cats
        private String name;
        private int appetite;
        private int hunger;
        private boolean wellFed;

        //конструтор класса Cats (голоден - да или нет)
        public Cats (String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
            this.wellFed = false;
        }

        //конструтор класса Cats (шкала голода)
        public Cats (String name, int appetite, int hunger) {
            this.name = name;
            this.appetite = appetite;
            this.hunger = hunger;
            this.wellFed = false;
        }

        // геттер выдает "аппетит" конкретного кота, если потребуется (на всякий случай)
        public int getAppetite() {
            return appetite;
        }

        //метод, показывающий текущее состояние кота
        public void catInfo (){
            if (wellFed) {
                System.out.println("Кот " + name + " сейчас сыт.");
            } else
                System.out.println("Кот " + name + " обычно съедает " + appetite + " еды за раз. Сейчас он голоден.");
            }

        //"простой" метод для кормежки кота. если еды в тарелке окажется недостаточно, кот есть не будет
        public void eat (Plate plate) {
            if (plate.foodInPlate > appetite) {
                plate.decreaseFood(appetite);
                wellFed = true;
                System.out.println("Кот " + name + " съел из тарелки " + appetite + " еды.");
            } else System.out.println("В тарелке осталось слишком мало еды. Надо добавить!");
        }

        // усложенный метод, учитывающий шкалу голода для тех котов, у которых указан этот параметр
        public void eatHunger (Plate plate) {
            if (hunger <= 0) {
                wellFed = true;
                System.out.println("Этот кот сейчас сыт и к тарелке даже не притронулся.");
            } else if (hunger < appetite) {
                    plate.decreaseFood(hunger);
                    wellFed = true;
                    System.out.println("Кот " + name + " съел " + hunger + " еды и теперь сыт.");
            } else if (plate.foodInPlate > appetite){
                plate.decreaseFood(appetite);
                hunger -= appetite;
                System.out.println("Кот " + name + " съел " + appetite + " еды. " +
                                    "Но для сытости должен съесть еще " + Math.abs(-hunger) + ".");
            } else
                System.out.println("В тарелке осталось слишком мало еды. Надо добавить!");
        }

}
