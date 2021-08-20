package homeworks.artur.danielyan.homework4;

public interface IVehicle {
    default void setFuelVolume(int setter){
        System.out.println("Vehicle has not a fuelVolume");
    }
}
