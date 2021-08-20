package homeworks.artur.danielyan.homework4;

public class Car extends Vehicle implements IVehicle{
    int fuelVolume;
    int doorCount;
    int currentFuelVolume;
    boolean direction; //true is forward

    //setters start
    int setFuelVolume(int setter){
        fuelVolume = setter;
    }

    int getDoorCount(){
        return doorCount;
    }

    int getCurrentFuelVolume(){
        return currentFuelVolume;
    }

    boolean getDirection(){
        return direction;
    }
    //setters end

    void drive(int speed){
        if(currentFuelVolume > 0) {
            if (direction) {
                System.out.println("Some vehicle is driving forward on the speed " + speed + " km/h");
            } else {
                System.out.println("Some vehicle is driving backward on the speed " + speed + " km/h");
            }
            currentFuelVolume -= speed/fuelVolume;
        }else{
            System.out.println("Some car has no fuel to drive");
        }
    }
}
