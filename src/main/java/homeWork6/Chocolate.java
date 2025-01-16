package homeWork6;

public class Chocolate extends Dessert{

    int numberOfBare;
    String colour;

    public Chocolate(int calloriesInOneGramm, int weight, int numberOfBare, String colour) {
        super(calloriesInOneGramm, weight);
        this.numberOfBare = numberOfBare;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "numberOfBare=" + numberOfBare +
                ", colour='" + colour + '\'' +
                '}';
    }
}
