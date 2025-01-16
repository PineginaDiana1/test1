package finalWork;


public class Fruit extends Ware{
    String sort;
    private int count = 0;

    public Fruit(int weight, String sort) {
        super(weight);
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "sort='" + sort + '\'' +
                '}';
    }




    }

