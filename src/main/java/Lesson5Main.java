public class Lesson5Main {
    public static void main(String[] args) {
//        String name = "jmmmmmmmmmj";
//        int i = Lesson5.countLetters('j', name);
//        System.out.println(i);

        Planet5 myPlanet = new Planet5();
        myPlanet.dayLength = 80;
        myPlanet.planetName = "Юпитер";
        myPlanet.mass = 8768;
        myPlanet.radius = 878;

        Planet5 myPlanet2 = new Planet5(8, "ориориб", 9, 80.9);

        System.out.println(myPlanet.dayLength);
        myPlanet.printInfo();

    }


}
