package homeworks.artur.danielyan.oop;

public interface IVehicle {
    default void drive(int speed){
        System.out.println("Some vehicle is driving on the speed " + speed + " km/h");
    }

    default double getCurrentGasolineVolume(){
        System.out.println("required vehicle has no field currentGasolineVolume");
        return 0;
    }
}
