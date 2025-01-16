package homeWork6;

public class IceCream extends Dessert {

    String flavour;

    public IceCream(int calloriesInOneGramm, int weight, String flavour) {
        super(calloriesInOneGramm, weight);
        this.flavour = flavour;
    }

@Override
    public void countCalloris() {
        weight = -1;
        System.out.println("Ошибка:" + weight);
    };

    @Override
    public String toString() {
        return "IceCream{" +
                "flavour='" + flavour + '\'' +
                '}';
    }
}
