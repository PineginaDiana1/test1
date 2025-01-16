public class Lesson5 {
    public static int countLetters(char searchedLetter, String target) {
        char[] charArray = target.toCharArray();
        int letterCounter = 0;

        for (char currentChar : charArray) {
            if (currentChar == searchedLetter) {
                letterCounter++;
            }
        }
        return letterCounter;
    }
}
