package finalWork;

public class Orange extends Fruit{
    int peelThickness;
    int slicesNumber;

    public Orange(int weight, String sort, int peelThickness, int slicesNumber) {
        super(weight, sort);
        this.peelThickness = peelThickness;
        this.slicesNumber = slicesNumber;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "peelThickness=" + peelThickness +
                ", slicesNumber=" + slicesNumber +
                ", sort='" + sort + '\'' +
                ", weight=" + weight +
                '}';
    }
}
