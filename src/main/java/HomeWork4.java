import java.util.Arrays;

public class HomeWork4 {
    public static void main(String[] args) {
numberWordInFraze("My name is Diana");
nameAndLastName("Diana", "Pinegina");
randomWord(2);
    }
    public static String[] numberWordInFraze(String words) {

        String[] result = words.split(" ");
        System.out.println(result.length);
        return result;
    }
    public static void nameAndLastName(String name, String lastName) {
        System.out.println("Внимание! " + name + " " + lastName + " героически спасает прода от падения! Вам начислено 2 СМ коина.");
    }
    public static void randomWord(int i) {
        String[] array = {"Арбуз", "Банан", "Виноград", "Дыня", "Яблоко"};
        System.out.println(array[i]);
    }
}
