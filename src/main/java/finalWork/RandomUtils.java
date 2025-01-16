package finalWork;

import com.github.javafaker.Faker;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class RandomUtils {
    private static Faker faker = Faker.instance();
    public static Fruit[] fruits = new Fruit[20];

//    Метод по получению рандомного числа
    public static int randomNumber() {
        int randomNumber = (int)faker.number().randomNumber();
        return randomNumber;
    }
//    Метод по получению рандомного сорта

    public static String randomSort () {
        String randomSort = faker.name().name();
        return randomSort;
    }
//    Метод по получению рандомного bool
    public static boolean randomBool() {
        boolean randomBool = faker.bool().bool();
        return randomBool;
    }
//    Метод генерации случайного массива (наполняем случайными фруктами и случайно перемещаиваем)
    public static void generateRandomArrayWithRandomFruits () {
        for (int i = 0; i < fruits.length; i++) {
            if (i % 2 == 0) {
                fruits[i] = new Apple(randomNumber(), randomSort(), randomBool(), randomBool());
            } else {
                fruits[i] = new Orange(randomNumber(),randomSort(),randomNumber(),randomNumber());
            }
        }
        List<Fruit> list = Arrays.asList(fruits);
        Collections.shuffle(list);
        fruits = list.toArray(new Fruit[0]);
    }

}