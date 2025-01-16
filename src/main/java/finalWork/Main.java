package finalWork;


import static finalWork.RandomUtils.fruits;
import static finalWork.RandomUtils.generateRandomArrayWithRandomFruits;


public class Main {
    public static void main(String[] args) {


        CityStorage cityStorage = new CityStorage();
        Shop shop1 = new Shop("Street 1");
        Shop shop2 = new Shop("Street 2");

        //        Генерируем массив :)
        generateRandomArrayWithRandomFruits();

//        Отгружаем фрукты на склад

        cityStorage.addFruits(fruits);

        System.out.println(cityStorage);
        System.out.println(shop1);
        System.out.println(shop2);

//        Отгружаем со склада 2 фрукта в первый магазин и 3 фрукта во второй магазин

        cityStorage.shipToStore(shop1, 2);
        cityStorage.shipToStore(shop2, 3);
        System.out.println(cityStorage);
        System.out.println(shop1);
        System.out.println(shop2);

    }
}


