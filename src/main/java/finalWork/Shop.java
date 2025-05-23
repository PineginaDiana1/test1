package finalWork;

import java.util.ArrayList;

public class Shop {

    private String address;
    private ArrayList<Fruit> fruits;

    public Shop(String address) {
        this.address = address;
        this.fruits = new ArrayList<>();
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public void addFruits(ArrayList<Fruit> fruitsList) {
        fruits.addAll(fruitsList);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "address='" + address + '\'' +
                ", fruits=" + fruits +
                '}';
    }
}

