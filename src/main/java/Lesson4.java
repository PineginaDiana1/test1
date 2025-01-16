import java.util.Arrays;

public class Lesson4 {
    public static void main(String[] args) {
        //sum
//        addNumbers(9, 10);
//        int result1 = addNumbers1(8, 2);
        String[][] vials = {
                {"H", "H", "O"},
                {"Ag", "U", "He"},
                {"O", "Pt", "C", "O"},
                {"Br", "Pt"}
        };
        String searchedElement = "Pt";

        for (int i = 0; i < vials.length; i++) {
            Analyze(vials[i], searchedElement);

        }
    }

    public static boolean Analyze(String[] vials, String searchedElement) {
        for (int i = 0; i < vials.length; i++) {
            String currentElements = vials[i];
            if (currentElements.equals(searchedElement)) {
                System.out.println(Arrays.toString(vials));
                return true;
            }
        }
        return false;

//    public static void addNumbers(int i1, int i2) {
//        int sum = i1 + i2;
//        System.out.println(String.format("%d + %d = %d", i1, i2, sum));
//    }
//
//    public static int addNumbers1(int i1, int i2) {
//        int sum = i1 + i2;
//        System.out.println(String.format("%d + %d = %d", i1, i2, sum));
//        return sum;
//    }

    }
}

