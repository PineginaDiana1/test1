package homeWork6;

import java.awt.*;

public class HomeWork6Main {
    public static void main(String[] args) {
        IceCream icecream = new IceCream(10, 100, "milk");

        icecream.countCalloris();

        Dessert dessert = new Dessert(2, 50);

        Chocolate chocolate = new Chocolate(2,55, 6, "black");

        dessert.countCalloris();

        String resultChocolate = chocolate.toString();
        System.out.println(resultChocolate);

        String text = dessert.toString();
        System.out.println(text);

        String resultIceCream = icecream.toString();
        System.out.println(resultIceCream);

        Dessert[] dessertArray = new Dessert[10];
        dessertArray[0] = chocolate;
        dessertArray[1] = icecream;








    }

}
