package homeworks.artur.danielyan.oop;

public class Car implements IVehicle{
    private String mark;
    private String number;
    private boolean isRightRudder;
    private final int maxGasolineVolume;
    private double currentGasolineVolume;
    private int maxSpeed;
    private int currentSpeed;

    public Car(String mark, String number, boolean isRightRudder, int maxGasolineVolume, int maxSpeed){
        this.mark = mark;
        this.number = number;
        this.isRightRudder = isRightRudder;
        this.maxGasolineVolume = maxGasolineVolume;
        this.maxSpeed = maxSpeed;
        this.currentGasolineVolume = this.maxGasolineVolume;
    }

    // getters
//    public String getMark() {
//        return mark;
//    }
//
//    public String getNumber() {
//        return number;
//    }
//
//    public boolean isRightRudder() {
//        return isRightRudder;
//    }
//
//    public int getMaxGasolineVolume() {
//        return maxGasolineVolume;
//    }
//
    public double getCurrentGasolineVolume() {
        return currentGasolineVolume;
    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }

    // setters

    public void setCurrentGasolineVolume(int currentGasolineVolume) {
        this.currentGasolineVolume = currentGasolineVolume;
    }

    // methods

    public void drive(int speed){
        if(this.currentGasolineVolume <= 0){
            System.out.println(" some car has no fuel to drive");
            return;
        }
        currentGasolineVolume -= (double) speed/maxGasolineVolume;
        System.out.println("some car is driving on the speed " + speed + " km/h");
    }
}
