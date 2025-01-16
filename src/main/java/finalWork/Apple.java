package finalWork;

public class Apple extends Fruit{
    boolean isWaxed;
    boolean ciderSuitable;

    public Apple(int weight, String sort, boolean isWaxed, boolean ciderSuitable) {
        super(weight, sort);
        this.isWaxed = isWaxed;
        this.ciderSuitable = ciderSuitable;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "isWaxed=" + isWaxed +
                ", ciderSuitable=" + ciderSuitable +
                ", sort='" + sort + '\'' +
                ", weight=" + weight +
                '}';
    }
}
