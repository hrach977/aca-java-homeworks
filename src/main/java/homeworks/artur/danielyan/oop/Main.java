package homeworks.artur.danielyan.oop;

public class Main {
    public static void main(String[] args) {
//        IVehicle car1 = new Car("Nissan","35HJ547",false,200,350);
//        System.out.println(car1.getCurrentGasolineVolume());
//        car1.drive(60);
//        System.out.println(car1.getCurrentGasolineVolume());

        Person p1 = new Person(true,165,16,"Artut]r");
        IVehicle vehicleForP1 = new Car("BMW","00oo000",false,300, 400);
        p1.setIVehicle(vehicleForP1);
        System.out.println(p1.getVehicle().getCurrentGasolineVolume());
        p1.getVehicle().drive(150);
        System.out.println(p1.getVehicle().getCurrentGasolineVolume());
    }
}
