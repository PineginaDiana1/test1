import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Первый");
        list.add("Второй");
        list.add("Третий");
        list.add("Четвертый");
        list.add("Пятый");


        System.out.println(list);

        System.out.println(list.get(3));

        list.remove(1);
        list.remove("Первый");
        System.out.println(list);

        list.set(0, "Edit");
        System.out.println(list);

        System.out.println(list.contains("Пятый"));

        System.out.println(list.indexOf("Пятый"));

        System.out.println(list.size());

        for(String currentElement : list) {
            System.out.println(currentElement);

            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(1);

            System.out.println(list2);
        }

    }

}
