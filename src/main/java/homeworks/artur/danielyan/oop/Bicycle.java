package homeworks.artur.danielyan.oop;

public class Bicycle implements IVehicle{
    private String mark;
    private String color;
    private int wheelRadius;
    private int seatHeight;
    private int rudderHeight;
    private int currentSpeed;

    public Bicycle(String mark, String color, int wheelRadius){
        this.mark = mark;
        this.color = color;
        this.wheelRadius = wheelRadius;
    }

    // setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public void setRudderHeight(int rudderHeight) {
        this.rudderHeight = rudderHeight;
    }

    // methods

    public void drive(int speed){
        System.out.println("some bicycle is driving on the speed " + speed + " km/h");
    }
}
