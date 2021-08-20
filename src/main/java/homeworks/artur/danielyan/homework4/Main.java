package homeworks.artur.danielyan.homework4;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Artur";
        p1.height = 170;
        //creating home for p1
        Home h1 = new Home();
        h1.areaSize = 80;
        h1.isOwn = false;
        h1.price = 120000;
        p1.home = h1;
        //creating car for p1
        Vehicle c1 = new Car();
        c1.setFuelVolume(200);

        //creating car for p1


    }
}
