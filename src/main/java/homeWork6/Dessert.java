package homeWork6;

public class Dessert {

    int calloriesInOneGramm = 200;
    int weight = 100;

    public Dessert(int calloriesInOneGramm, int weight) {
        this.calloriesInOneGramm = calloriesInOneGramm;
        this.weight = weight;
    }



    public void countCalloris() {
       int result = calloriesInOneGramm * weight;
        System.out.println(result);
    };

}