public class MainHomeWork5 {
    public static void main(String[] args) {
        AutoHomeWork5 auto1 = new AutoHomeWork5(4, "red" );

        AutoHomeWork5 auto2 = new AutoHomeWork5();
        auto2.colour = "black";

        auto1.canRide();
        auto1.haveDoor();
        auto2.haveDoor();
        AutoHomeWork5.numberOfSaleCar();

        System.out.println(auto1.colour);
        System.out.println(auto1.door);
        System.out.println(auto2.colour);
        System.out.println(AutoHomeWork5.haveWheel);




    }
}
