public class Planet5 {
    double radius;
    long mass;
    String planetName;
    int dayLength;

    public Planet5(int dayLength, String planetName, long mass, double radius) {
        this.dayLength = dayLength;
        this.planetName = planetName;
        this.mass = mass;
        this.radius = radius;
    }
    //    public Planet5(double radius, long mass, String planetName, int dayLength) {
//        this.radius = radius;
//        this.mass = mass;
//        this.planetName =
//                planetName;
//        this.dayLength = dayLength;
//    }
public Planet5() {}

    public void printInfo () {
        System.out.println(String.format("%s имеет массу %d, диаметр %f и продолжительность дня %d ", planetName, mass, radius * 2, dayLength));
    }
}
