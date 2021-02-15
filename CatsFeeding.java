package ru.geek.homeworks.lesson7.feedingCats;

public class CatsFeeding {

    public static void main(String[] args) {

        //создаем экземпляр тарелки (количество еды, вместимость тары)
        Plate plate = new Plate (55, 55);

        //создаем массив с котами
        Cats[] catsList = { new Cats("Barsik", 10),
                            new Cats("Snowball", 20),
                            new Cats("Tom", 15, 20),
                            new Cats("Garfield", 25,30) };

        // знакомимся с первым котом; кормим его "простым" методом eat; проверяем, голоден ли кот и сколько еды осталось
        catsList[0].catInfo();
        catsList[0].eat(plate);
        catsList[0].catInfo();
        plate.plateInfo();
            System.out.println();

        // кормим двух других котов, проверяем остаток еды
        catsList[1].eat(plate);
        catsList[2].eat(plate);
        plate.plateInfo();
            System.out.println();

        // подводим к миске четвертого кота со сложной шкалой голода, проверяем работу методов addFood и eatHunger
        catsList[3].catInfo();
        catsList[3].eatHunger(plate);
        plate.addFood(40);
        catsList[3].eatHunger(plate);
        catsList[3].eatHunger(plate);
        catsList[3].catInfo();

    }
}

