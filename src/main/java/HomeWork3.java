import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        String[] gameCard = {"6", "7", "8", "9", "10", "валет", "дама", "король", "туз"};
        Random Card = new Random();
        int n = Card.nextInt(9);
        //System.out.println(gameCard[n]);


        Scanner sc = new Scanner(System.in);

        System.out.println("Угадайте загаданную карту. Выберете из 6,7,8,9,10,Валет,Дама,Король,Туз");
        String userInput = sc.nextLine();
        System.out.println("Вы выбрали: " + userInput);

        if (userInput.toLowerCase().equals(gameCard[n])) {
            System.out.println("Вы угадали. Загаданная карта = " + gameCard[n]);
        } else {
            System.out.println("Вы не угадали. Загаданная карта = " + gameCard[n]);
        }
    }
}
