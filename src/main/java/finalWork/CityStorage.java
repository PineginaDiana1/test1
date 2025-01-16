package finalWork;

import java.util.ArrayList;

public class CityStorage {
    private static ArrayList<Fruit> fruitsList;

    public CityStorage() {
        fruitsList = new ArrayList<>();
    }

//    Метод для добавления фруктов на склад

    public static void addFruits(Fruit[] fruitsArray) {
        for (Fruit fruit : fruitsArray) {
            fruitsList.add(fruit);
        }
    }

//    Метод для добавления фруктов в магазин

    public ArrayList<Fruit> shipToStore(Shop shop, int numberOfFruits) {
        ArrayList<Fruit> shippedFruits = new ArrayList<>();
        for (int i = 0; i < numberOfFruits && !fruitsList.isEmpty(); i++) {
            shippedFruits.add(fruitsList.remove(0));
        }
        shop.addFruits(shippedFruits);
        return shippedFruits;
    }
    @Override
    public String toString() {
        return "CityStorage{" +
                "fruits=" + fruitsList +
                '}';
    }
}





