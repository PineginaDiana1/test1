public class AutoHomeWork5 {
    int door;
    String colour;

    static String haveWheel;

    public AutoHomeWork5(int door, String colour) {
        this.door = door;
        this.colour = colour;
    }

    public AutoHomeWork5() {
    }

    public void canRide () {
        System.out.println("Машина умеет ездить");
    }

    public void haveDoor () {
        if (door > 0) {
            System.out.println("У всех машин есть двери");
        } else {
            System.out.println("Это не машина");
        }
    }
    public static void numberOfSaleCar () {
        System.out.println(1000);
    }

}
